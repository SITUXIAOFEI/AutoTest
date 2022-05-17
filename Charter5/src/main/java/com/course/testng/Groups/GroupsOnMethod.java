package com.course.testng.Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    //将方法设置分组server
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是server的测试案例1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是server的测试案例2222");
    }

    //将方法设置分组client
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是client的测试案例3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是client的测试案例4444");
    }


    //在分组名为client的Test运行之前，先运行下列@BeforeGroups("client")
    @BeforeGroups("client")
    public void BeforeGroupsOnClient(){
        System.out.println("这个是客户端组运行的之前的运行方法");
    }
    //在分组名为client的Test运行后紧接运行下列@AfterGroups("client")
    @AfterGroups("client")
    public void AfterGroupsOnClient(){
        System.out.println("这个是客户端组运行的之后的运行方法！！！");
    }

    //在分组名为server的Test运行之前，先运行下列@BeforeGroups("server")
    @BeforeGroups("server")
    public void BeforeGroupsOnServer(){
        System.out.println("这个是服务端组运行的之前的运行方法");
    }
    //在分组名为server的Test运行后紧接运行下列@AfterGroups("server")
    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("这个是服务端组运行的之后的运行方法！！！！");
    }
}
