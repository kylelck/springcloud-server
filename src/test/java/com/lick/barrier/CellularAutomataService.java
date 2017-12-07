package com.lick.barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @description：
 * @author: lick
 * @date: 2017年12月07日 16:42
 * @copyright: 版权归lick 所有
 */
public class CellularAutomataService {

    public void start(){
        int count = Runtime.getRuntime().availableProcessors();
        CyclicBarrier barrier = new CyclicBarrier(count,
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("ok");
                    }
                });
        CellWork[] cellWorks = new CellWork[count];
        for(int i = 0 ; i < count; i++){
            cellWorks[i] = new CellWork(barrier,"print:"+i);
            new Thread(cellWorks[i]).start();
        }

    }
}
