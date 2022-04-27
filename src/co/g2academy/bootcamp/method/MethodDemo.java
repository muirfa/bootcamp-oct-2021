/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.method;

/**
 *
 * @author Asus
 */
public class MethodDemo {
    public static int minimumFunction(int n1, int n2){
        // red
//        return 0;

        //green
//        int minimum;
//        if (n1 > n2){
//            minimum = n2;
//        } else {
//            minimum = n1;
//        }
//        return minimum;

        //refactor
        return n1 < n2 ? n1 : n2;
    }
    
    public static double minimumFunction(double n1, double n2){
        return n1 < n2 ? n1 : n2;
    }
}
