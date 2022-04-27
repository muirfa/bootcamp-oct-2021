/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.math;

/**
 *
 * @author Asus
 */
public class Factorial {
    public int calculateFactorial(int n){
//          n! is n * n-1 * n - 2 * .... * 1
//          5! 5 * 4 * 3 * 2 * 1 = 120
//          use for
//          use x=x * i with x initially equals to 1
            int f = 1;
            for(int  i = n; i>=1 ; i--){
                f = f*i;
            }


            return f;
    }
}
