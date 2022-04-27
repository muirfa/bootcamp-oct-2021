/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.FilePermission;
import java.security.PermissionCollection;

/**
 *
 * @author Asus
 */
public class FilePermissionExample {
    public static void main (String[] args){
        String filePath = "C:\\bootcampg2\\java\\out.txt";
        FilePermission bootcampFilePermission = new FilePermission("C:\\bootcampg2\\java\\-", "read");
        PermissionCollection pemissionCollection = bootcampFilePermission.newPermissionCollection();
        pemissionCollection.add(bootcampFilePermission);
        FilePermission outTxtFilePermission = new  FilePermission(filePath, "write");
        pemissionCollection.add(outTxtFilePermission);
        if(pemissionCollection.implies(new FilePermission(filePath, "read, write"))){
            System.out.println("Read, write permission is grated for the path :" + filePath);
        } else {
            System.out.println("No read, write permission is granted for the path : " + filePath);
        }
        
    }
}
