/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.threadpool;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;


/**
 *
 * @author Asus
 */
public class RejectedExecutorHandleImpl implements RejectedExecutionHandler{
     @Override
     public void rejectedExecution(Runnable r, ThreadPoolExecutor executor){
         System.out.println(r.toString() + "is rejected");
     }
}
