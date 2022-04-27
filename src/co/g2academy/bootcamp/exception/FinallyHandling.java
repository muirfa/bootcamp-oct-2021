/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.exception;

/**
 *
 * @author Asus
 */
public class FinallyHandling {
    public void exceptionDoesNotOccur(){
        try{
            int x =25/5;
        } catch (NullPointerException ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Finaly block is always excecuted");
        }System.out.println("Rest of the code");
    }
    
    public void exceptionOccurAndHandled(){
        try{
            int x =25/0;
        } catch (ArithmeticException ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Finaly block is always excecuted");
        }System.out.println("Rest of the code");
    }
    
    public void exceptionOccurNotHandled(){
        try{
            int x =25/0;
        } catch (NullPointerException ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Finaly block is always excecuted");
        }System.out.println("Rest of the code");
    }
    
    public static void main(String[] args) {
        FinallyHandling finallyHandling = new FinallyHandling();
        finallyHandling.exceptionDoesNotOccur();
        finallyHandling.exceptionOccurAndHandled();
        finallyHandling.exceptionOccurNotHandled();
    }
}
