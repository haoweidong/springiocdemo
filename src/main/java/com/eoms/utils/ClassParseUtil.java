package com.eoms.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springiocdemos
 * @description:
 * @author: haoweidong
 * @create: 2020-10-19 15:43
 */
public class ClassParseUtil {

    public static List<Class<?>> getClasses(String beanName){
        List<Class<?>> classz=new ArrayList<Class<?>>();
        try {
            Class<?> aClass = Class.forName("com.eoms.service.UserServiceImpl");
            Class<?> aClas2 = Class.forName("com.eoms.service.OrderServiceImpl");
            classz.add(aClass);
            //aClass.getClass();
            classz.add(aClas2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return classz;
    }


}
