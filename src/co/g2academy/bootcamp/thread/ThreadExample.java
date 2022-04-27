/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.thread;

/**
 *
 * @author Asus
 */
public class ThreadExample extends Thread{

    @Override
    public void run() {
        System.out.println("this thread: " + getName() + " is running and has id: " + getId());
        try{
            sleep(1000*15);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ThreadExample example = new ThreadExample();
        example.start();
    }
    
    
}
