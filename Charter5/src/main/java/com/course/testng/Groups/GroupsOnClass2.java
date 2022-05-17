package com.course.testng.Groups;

import org.testng.annotations.Test;

//将类的分组设置为stu
@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass222中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass222中的stu2运行");
    }
}
