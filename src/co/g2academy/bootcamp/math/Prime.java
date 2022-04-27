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
public class Prime {
    public boolean isPrimeNumber (int n){
//    use for start from 2 until n - 1
//    use % operator
//    if from 2 until n - 1  modulo return 0 then false
//    if NO number from 2 until n -1 succesfully
//    modulo then return true

    for(int i = 2; i < n; i++){
        if(n % i == 0){
            return false;
        }
    }
    
    return true;
    }
}
