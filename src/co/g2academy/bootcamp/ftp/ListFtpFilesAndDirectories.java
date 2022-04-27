/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.ftp;

import java.io.IOException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author Asus
 */
public class ListFtpFilesAndDirectories {
    private FTPClient client =  new FTPClient();
    public ListFtpFilesAndDirectories(){
        String hostname = "localhost";
        int port = 21;
        String userName = "irfan";
        String password = "21";
        try{
            client.connect(hostname, port);
            client.login(userName, password);
            client.enterLocalPassiveMode();
            client.setFileType(FTP.BINARY_FILE_TYPE);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void listAllFileAndDirectories(String remoteDir){
        try{
            FTPFile file =  client.mlistFile(remoteDir);
            System.out.println(remoteDir);
            FTPFile[] files =  client.listFiles(remoteDir);
            for(FTPFile f : files){
                System.out.println(remoteDir + "/" + f.getName());
            }
            FTPFile[] directories = client.listDirectories(remoteDir);
            if (directories != null && directories.length > 0) {
                for (FTPFile directory : directories){
                    listAllFileAndDirectories(remoteDir + "/" + directory.getName());
                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ListFtpFilesAndDirectories ftp = new ListFtpFilesAndDirectories();
        ftp.listAllFileAndDirectories("");
    }
}
