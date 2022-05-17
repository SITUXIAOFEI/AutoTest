package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 使用场景：在期望结果为异常的时候，例如：擦传入不合法参数，程序抛异常，预期结果就是异常
     */
    //这个是测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void RunExceptionFail(){
        System.out.println("这个是失败的异常场景");
    }

    //这个一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void RunExceptionSuccess(){
        System.out.println("这个一个成功的异常测试");
        throw new RuntimeException();
    }
}
