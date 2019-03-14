package com.zhangfan.test;

public class GitDemo2 {

    public static void main(String[] args) {
        String s1 = "6666";
        String s2 = "hahah";
        String s3 = "hahah";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("===============");
        /**
         * String是被final修饰的，也就是不可修改，不能被继承的
         */
        //常量不同，导致地址不同，== 比较就是地址
        System.out.println(s1 == s2);
        System.out.println("===============");
        //有一个人字符串常量池，如果池中有原来常量，就会返回相同的地址
        System.out.println(s3 == s2);
//        System.out.println("在idea上测试");
        System.out.println("********************");
        String s = new String("6666");
        System.out.println(s.length());
        System.out.println(s == s1);

    }
}
