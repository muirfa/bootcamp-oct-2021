/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Asus
 */
public class ThreadPoolExample {
    public static void main(String[] args) {
//        create a pool 5 thread
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        
//        create 10 task to be executed by above thread pool
        for (int i=0; i<10; i++){
            Runnable worker = new WorkerThread("" + i);
            executorService.execute(worker);
        } executorService.shutdown();
        
        while(!executorService.isTerminated()){
//        wait for ever until all task is executed
        }
        
        System.out.println("finish executing all task");
    }
}
