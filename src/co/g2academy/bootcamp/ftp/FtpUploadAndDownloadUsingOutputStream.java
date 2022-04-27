/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.ftp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Asus
 */
public class FtpUploadAndDownloadUsingOutputStream {
    private FTPClient client = new FTPClient();
    public FtpUploadAndDownloadUsingOutputStream(){
//        initiate connection
    String hostname = "localhost";
    int port = 21;
    String userName = "irfan";
    String password = "21";
    try{
        client.connect(hostname, port);
        client.login(userName, password);
        client.setFileType(FTP.BINARY_FILE_TYPE);
    }catch(IOException ex){
        ex.printStackTrace();
    }
    }
    public void uploadFileToFtp(String localFile, String remoteFile) throws InterruptedException{
        File local = new File(localFile);
        try{
            InputStream inputStream = new FileInputStream(local);
            OutputStream outputStream = client.storeFileStream(remoteFile);
            byte[] buffer = new byte[4096];
            int read = 0;
            System.out.println("Start uploading file using outputStream");
            while((read = inputStream.read(buffer)) != -1){
                outputStream.write(buffer, 0, read);
                Thread.sleep(1); //delay transfering byte so it not overhelm server
            }
            inputStream.close();
            outputStream.close();
            boolean done = client.completePendingCommand();
            if (done) {
                System.out.println("Upload complete");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void downloadFileToFtp(String localFile, String remoteFile) throws InterruptedException{
        File local = new File(localFile);
        try{
            FileOutputStream fos = new FileOutputStream(local);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            System.out.println("Starting download file " + remoteFile);
            InputStream inputStream = client.retrieveFileStream(remoteFile);
            byte[] buffer = new byte[4096];
            int read = -1;
            while((read = inputStream.read(buffer)) != -1){
                bos.write(buffer, 0, read);
                Thread.sleep(1); //delay to intentionally slower download rate
            }
            bos.close();
            fos.close();
            boolean done =  client.completePendingCommand();
            if (done) {
                System.out.println("Download success");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        FtpUploadAndDownloadUsingOutputStream ftp = new FtpUploadAndDownloadUsingOutputStream();
//        ftp.uploadFileToFtp("C:\\bootcampg2\\commons-net-3.8.0-bin.zip", "/upload/commons-net-3.8.0-bin.zip");
        ftp.downloadFileToFtp("C:\\bootcampg2\\download\\commons-net-3.8.0.jar", "/commons-net-3.8.0.jar");
    }
}
