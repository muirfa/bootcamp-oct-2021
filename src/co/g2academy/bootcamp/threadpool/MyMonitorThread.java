/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author Asus
 */
public class MyMonitorThread implements Runnable {
    private  ThreadPoolExecutor threadPoolExecutor;
    private int delay;
    private boolean run = true;
    
    public MyMonitorThread(ThreadPoolExecutor threadPoolExecutor, int delay){
        this.threadPoolExecutor = threadPoolExecutor;
        this.delay = delay;
    }
    
    public void shutdown(){
        run = false;
    }
    
    public void run(){
        while(run){
            int poolSize = threadPoolExecutor.getPoolSize();
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int activeThread = threadPoolExecutor.getActiveCount();
            long completed = threadPoolExecutor.getCompletedTaskCount();
            long task =  threadPoolExecutor.getTaskCount();
            boolean isShutdown = threadPoolExecutor.isShutdown();
            boolean isTerminated = threadPoolExecutor.isTerminated();
            
            String monitoringText = String.format("[monitor] [%d/%d] active: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                    poolSize,
                    corePoolSize,
                    activeThread,
                    completed,
                    task,
                    isShutdown,
                    isTerminated);
            System.out.println(monitoringText);
            try{
                Thread.sleep(delay * 1000);
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
