package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConf {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件运行啦");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
}
