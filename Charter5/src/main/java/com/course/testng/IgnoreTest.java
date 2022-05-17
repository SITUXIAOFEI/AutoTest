package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void IgnoreTest1(){
        System.out.println("Igore_1执行");
    }

    @Test(enabled = false)
    public void IgnoreTest2(){
        System.out.println("Igore_2不执行");
    }

    @Test(enabled = true)
    public void IgnoreTest3(){
        System.out.println("Igore_3执行");
    }
}
