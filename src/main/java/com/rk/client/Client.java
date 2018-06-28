package com.rk.client;

import com.rk.beans.Organization;
import com.rk.beans.Pic;
import com.rk.beansConfig.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {


    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
        Pic pic=applicationContext.getBean(Pic.class);
        Organization organization =applicationContext.getBean(Organization.class);
        System.out.println(pic);
        System.out.println(organization);
    }
}
