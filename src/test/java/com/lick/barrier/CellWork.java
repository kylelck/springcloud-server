package com.lick.barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2017年12月07日 16:45
 * @copyright: 版权归hsyuntai 所有
 */
public class CellWork implements Runnable {
    private final String str;
    private final CyclicBarrier barrier;

    public CellWork(CyclicBarrier barrier,String str){
        this.str = str;
        this.barrier = barrier;
    }
    @Override
    public void run(){
        System.out.println(str);
        try {
//            Thread.sleep(3000);
            barrier.await();
        }catch (Exception e){
            return;
        }
   }
}
