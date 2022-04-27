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
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Asus
 */
public class FTPUploadAndDownloadFile {
    private FTPClient client;
    
    public FTPUploadAndDownloadFile(){
        client =  initiateConnection();
    }
    
    public FTPClient initiateConnection(){
        String server = "localhost";
        int port = 21;
        String userName = "irfan";
        String password =  "21";
        
        FTPClient client = new FTPClient();
        try{
            client.connect(server, port);
            client.login(userName, password);
            client.setFileType(FTP.BINARY_FILE_TYPE);
        }catch (IOException ex){
            ex.printStackTrace();
        } return client;
    }
    
    public void uploadFileToFtp(String localFile, String remoteFile){
        File local =  new File(localFile);
        try{
            InputStream inputStream =  new FileInputStream(local);
            System.out.println("start uploading " + localFile);
            boolean done = client.storeFile(remoteFile, inputStream);
            if (done) {
                System.out.println("File is uploaded"); 
           }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void downloadFileFromFTP(String localFile, String remoteFile){
        File local = new File(localFile);
        try{
            FileOutputStream fot =  new FileOutputStream(local);
            BufferedOutputStream bos =  new BufferedOutputStream(fot);
            System.out.println("start downloading file " + remoteFile);
            boolean done =  client.retrieveFile(remoteFile, bos);
            if (done) {
                System.out.println("Success downlaod file");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        FTPUploadAndDownloadFile ftp = new FTPUploadAndDownloadFile();
//        ftp.uploadFileToFtp("C:\\Reflect_Install.log", "upload/Reflect_Install.log");
        ftp.downloadFileFromFTP("C:\\bootcampg2\\download\\BiCycle.class", "Java/Bicycle.class");
    }
}
