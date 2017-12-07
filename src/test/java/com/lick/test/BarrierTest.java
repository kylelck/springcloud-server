package com.lick.test;

import com.lick.SpringcloudServerApplicationTests;
import com.lick.barrier.CellularAutomataService;
import org.junit.Test;

/**
 * @description：
 * @author: lick
 * @date: 2017年12月07日 16:36
 * @copyright: 版权归lick所有
 */
public class BarrierTest extends SpringcloudServerApplicationTests {

    @Test
    public void CellTest(){
        CellularAutomataService cu = new CellularAutomataService();
        cu.start();
    }
}
