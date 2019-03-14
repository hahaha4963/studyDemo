package com.zhangfan.test;

public class DiGuiDemo {
    public static void main(String[] args) {
        Long i = 10L;
        System.out.println("i! = "+fac(i));
    }

     static Long fac(Long n){
        if(n <= 1L){
            return 1L;
        }else {
            return n*fac(n-1);
        }
    }
}
