/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.parallel.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Asus
 */
public class Java8parallelStreamExample {

    public static void main(String[] args) {
        System.out.println("===================================================="); //ctrl + shift + arrow down
        System.out.println("using sequenttial stream");
        System.out.println("===================================================="); //ctrl + shift + arrow down / up
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(s -> {
            System.out.println(s + " is processed by " + Thread.currentThread().getName() + " thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        System.out.println("===================================================="); //ctrl + shift + arrow down / up
        System.out.println("using parallel stream");
        System.out.println("===================================================="); //ctrl + shift + arrow down / up

        IntStream parallelIntStream = Arrays.stream(intArray).parallel();
        parallelIntStream.forEach(s -> {
            System.out.println(s + " is processed by " + Thread.currentThread().getName() + " thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
    }

}
