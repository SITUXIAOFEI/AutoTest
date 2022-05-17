package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000) //
    public void TestSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000) //
    public void TestFail() throws InterruptedException{
        Thread.sleep(3000);
    }

}
