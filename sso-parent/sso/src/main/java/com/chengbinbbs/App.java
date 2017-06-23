package com.chengbinbbs;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
//@SpringBootApplication
//@ImportResource(locations={"classpath:spring-service.xml"})
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-service.xml") ;
        ac.start();
        System.out.println("Order服务提供者在注册中心暴露服务");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
