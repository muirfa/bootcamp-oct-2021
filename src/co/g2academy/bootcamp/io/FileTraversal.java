/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.io;

import java.io.File;

/**
 *
 * @author Asus
 */
public class FileTraversal {
    public static void main(String[] args) {
        File file = new File("C:\\");
        tranverseDirectory(file);
    }
        
    public static void tranverseDirectory(File directory){
        File[] directoryContents = directory.listFiles();
        if( directoryContents == null){
            return ;
        }
        for (File fileDirectory : directoryContents){
            if(fileDirectory.isDirectory()){
                printIfItIsBigFileOrDirectory("d", fileDirectory.getPath(), fileDirectory.length());
                tranverseDirectory(fileDirectory);
            } else {
               printIfItIsBigFileOrDirectory("f", fileDirectory.getPath(), fileDirectory.length());
            }
        }
    }
    public static void printIfItIsBigFileOrDirectory(String type, String path, Long length) {
        if (length >= 100_000_000){
            System.out.println(type + " " + path + " " + length);
        }
    }
}
