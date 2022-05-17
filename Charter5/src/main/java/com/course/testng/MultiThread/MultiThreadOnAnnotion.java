package com.course.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 2)
    public void Test1(){
        System.out.println("输出");
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
