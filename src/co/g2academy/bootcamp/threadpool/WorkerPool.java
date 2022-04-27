/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.threadpool;

import co.g2academy.bootcamp.thread.WorkerThread;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Asus
 */
public class WorkerPool {
    public static void main(String[] args) {
        RejectedExecutionHandler handler = new RejectedExecutorHandleImpl();
        ThreadFactory factory = Executors.defaultThreadFactory();
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), factory, handler);
        MyMonitorThread myMonitorThread = new MyMonitorThread(executorPool, 3);
        Thread monitorThread = new Thread(myMonitorThread);
        monitorThread.start();
        for (int i = 0; i < 10; i++){
            executorPool.execute(new WorkerThread("cmd" + 1));
        }
        try{
            Thread.sleep(30000);
            executorPool.shutdown();
            
            Thread.sleep(5000);
            myMonitorThread.shutdown();
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        
    }
}
