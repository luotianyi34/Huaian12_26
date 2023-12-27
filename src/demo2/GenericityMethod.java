package demo2;

import demo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericityMethod {
    /*
    定义泛型方法
    有一个方法，返回值类型不确定 根据你传入的类型来决定方法的返回值类型

    语法:定义格式:修饰符<表示泛型方法>返回值类型 方法名<参数>(具体的逻辑代码)
    规则:1.所有泛型方法声明的时候都有一个类型参数,并且声明部分(由<>分割)。该类型参数声明部分在方法返回类型之前
        2.每一个类型参数声明部分包含一个或者多个类型参数，参数之间用逗号隔开，一个泛型参数就是一个类型的变量
        3.类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符
        4.泛型方法体的声明和其他方法一样，注意类型参数只能代表引用数据类型，不能是基本数据类型



    * */
//    public static <T> List<T> asList(T ...a){
//        return new ArrayList<T>();
//    }

    public static void main(String[] args) {
//        asList(10,20,30);
//        Arrays.asList(10,20,30);
//        System.out.println(method1(1));//Integer
//        System.out.println(method1("hello world"));//String
//        Generic<String> generic = new Generic<>();
//        Generic<Student> generic2 = new Generic<>();
//        generic.setValue("hahaha");
//        generic2.setValue(new Student("admin",20) );
//        System.out.println(generic.toString());
//        System.out.println(generic2.toString());
        Generatorlmpl<String> generatorlmpl = new Generatorlmpl<>("我是接口泛型实现的");
        System.out.println(generatorlmpl.getValue());
        System.out.println(generatorlmpl.get("我是王天润"));

//        List list1=  myList(1,2,3);
//        System.out.println(list1);
//        List list2 = myList("hello","你好","ok");
//        System.out.println(list2);
//        List list3 = myList("wosho",31);
//        System.out.println(list3);
    }
    public static <T> T method1(T t1){

        return t1;
    }
    //定义一个方法 可以接收多种数据类型 并将参数封装成集合返回
    public static <T> List<T> myList(T ...t1){
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < t1.length; i++) {
            list.add(t1[i]);
        }
        return list;
    }




}
