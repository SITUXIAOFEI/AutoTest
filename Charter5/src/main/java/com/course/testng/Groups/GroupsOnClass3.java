package com.course.testng.Groups;

import org.testng.annotations.Test;

//将类的分组设置为teacher
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void Teacher1(){
        System.out.println("GroupsOnClass333中的Teacher1运行");
    }
    public void Teacher2(){
        System.out.println("GroupsOnClass333中的Teacher2运行");
    }
}
