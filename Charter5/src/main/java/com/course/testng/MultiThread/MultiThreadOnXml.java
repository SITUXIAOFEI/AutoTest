package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void Test1(){
        System.out.println("输出1");
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void Test2(){
        System.out.println("输出2");
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void Test3(){
        System.out.println("输出3");
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
