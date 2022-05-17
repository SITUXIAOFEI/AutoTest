package com.course.testng.Paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    //由@DataProvider提供参数
    @Test(dataProvider = "date")
    public  void TestDataProvider(String name,int age){
        System.out.println("name = " + name + "，age = " + age);
    }

    //将参数传给name = "date"的 @Test
    @DataProvider(name = "date")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三",20},
                {"李四",15},
                {"王五",30}
        };
        return o;
    }
//、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、
    //创建两个Test方法
    @Test(dataProvider = "methodDta")
    public void Test1(String name,int age){
        System.out.println("Test1的输出：name = " + name + "，age = " + age);
    }
    @Test(dataProvider = "methodDta")
    public void Test2(String name,int age){
        System.out.println("Test2的输出：name = " + name + "，age = " + age);
    }

    //由@DataProvider将参数传给名为methodDta的@Test
    @DataProvider(name = "methodDta")
    public Object[][] methodDtaTest(Method method){
        Object[][] result=null;
        //如果@Test的方法名称为Test1，执行下列语句
        if (method.getName().equals("Test1")){
            result = new Object[][]{
                    {"张三",20},
                    {"李四",15}
            };
        }
        //如果@Test的方法名称为Test2，执行下列语句
        else if(method.getName().equals("Test2")){
            result = new Object[][]{
                    {"王五",30},
                    {"老刘",45}
        };
        }
        //将参数结果抛出
        return result;
    }

}
