package com.course.testng.Groups;

import org.testng.annotations.Test;

//将类的分组设置为stu
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass111中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1111中的stu2运行");
    }
}
