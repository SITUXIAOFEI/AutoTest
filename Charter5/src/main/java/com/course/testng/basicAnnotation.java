package com.course.testng;

import org.testng.annotations.*;

public class basicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    // @Test相当于main方法：public static void main(String[] args){}
    @Test
    public void TestCase1(){
        System.out.println("这个是TestCase1");
    }

    @Test
    public void TestCase2(){
        System.out.println("这个是TestCase2");
    }

    // @BeforeMethod这个是在每个方法执行之前运行的
    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforeMethod这个是在测试方法之前运行的");
    }

    // @AfterMethod这个是在每个方法执行之后运行的
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这个是在测试方法之后运行的");
    }

    // @BeforeClass这个是在所有方法执行之前运行的
    @BeforeClass
    public void beforClass(){
        System.out.println("BeforeClass这个是在测试方法之前运行的");
    }

    // @AfterClass这个是在所有方法执行之后运行的
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这个是在测试方法之前后行的");

    }

    // @BeforeSuite这个是在类执行之前运行的
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("afterSuite测试套件，这个是在类方法执行之前执行的");
    }

    // @AfterSuite这个是在类执行之后运行的
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件，这个是在类方法执行之后执行的");
    }
}
