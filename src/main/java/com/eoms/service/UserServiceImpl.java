package com.eoms.service;

import com.eoms.annotion.SelfAutowired;
import com.eoms.annotion.SelfService;

/**
 * @program: springiocdemos
 * @description:
 * @author: haoweidong
 * @create: 2020-10-19 16:08
 */
@SelfService
public class UserServiceImpl {
    @SelfAutowired
    OrderServiceImpl orderServiceImpl;
    public void  add(){
        orderServiceImpl.addOder();
        System.out.println("初始化完成");
    }
}

