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
public class RunnableExample implements Runnable{

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("this thread : " + thread.getName() + " is running and it has id " + thread.getId());
        try {
            thread.sleep(1000*15);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
       
    }
    
    public static void main(String[] args) {
        RunnableExample example = new RunnableExample();
        Thread thread = new Thread(example);
        thread.start();
    }

            
    
}
