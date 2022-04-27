/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exam;

/**
 *
 * @author Asus
 */
public class FibonacciSeries {

    public static String printFibonacciSeries(int n) {
        if (n == 1) {
            return "1";
        }
        int fibo;
        int nMin1 = 1;
        int nMin2 = 1;
        String fibonacci = "1 1 ";
        for (int i = 3; i <= n; i++) {
            fibo = nMin1 + nMin2;

            nMin2 = nMin1;
            nMin1 = fibo;
            fibonacci = fibonacci + fibo + " ";

        }
        return fibonacci.trim();
    }
}
