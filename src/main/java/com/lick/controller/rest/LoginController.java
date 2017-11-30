package com.lick.controller.rest;

import com.google.common.collect.Iterables;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

/**
 * @description：
 * @author: lick
 * @date: 2017年11月16日 17:21
 * @copyright: 版权归 lick 所有
 */
@RestController
public class LoginController {
    @RequestMapping("/index")
    public String index(){
        return "hello world";
    }
}
