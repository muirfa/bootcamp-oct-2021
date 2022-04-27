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
public class WorkerThread implements Runnable {
    private String message;
    
    public WorkerThread (String message){
        this.message = message;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " is (Start) message " + message);
        processmessage();
        System.out.println(thread.getName() + " (end)");
    }
    
    private void processmessage(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
}
