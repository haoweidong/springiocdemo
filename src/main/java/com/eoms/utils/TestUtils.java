package com.eoms.utils;

import com.eoms.service.UserServiceImpl;
import com.eoms.spring.ext.SelfPathXmlApplicationContext;

/**
 * @program: springiocdemos
 * @description:
 * @author: haoweidong
 * @create: 2020-10-19 16:12
 */
public class TestUtils {

    public static void main(String[] args) throws Exception {
        SelfPathXmlApplicationContext context=new SelfPathXmlApplicationContext("");
        UserServiceImpl userImpl= (UserServiceImpl)context.getBean("userServiceImpl");
        userImpl.add();
    }
}
