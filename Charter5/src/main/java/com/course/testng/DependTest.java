package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public  void  Test1(){
        System.out.println("这个是Test1的输出");
    }
    @Test
    public  void  Test2(){
        System.out.println("这个是Test2的输出");
        throw new RuntimeException();
        //抛出异常
    }

    //执行Test3，需要依赖于Test1
    @Test(dependsOnMethods = {"Test1"})
    public  void  Test3(){
        System.out.println("这个是Test3的输出");
    }

    //执行Test4，需要依赖于Test2
    //Test2抛异常，所以Test4忽略不执行
    @Test(dependsOnMethods = {"Test2"})
    public  void  Test4(){
        System.out.println("这个是Test4的输出");
    }
}

