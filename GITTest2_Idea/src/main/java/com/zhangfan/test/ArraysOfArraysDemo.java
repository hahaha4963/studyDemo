package com.zhangfan.test;

public class ArraysOfArraysDemo {
    public static void main(String[] args) {
        char[][] chars = new char[2][4];
        char[] row1 = {'A','B','C','D'};
        char[] row2 = {'a','b','c','d'};

        chars[0] = row1;
        chars[1] = row2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(chars[i][j]);
            }
        }
    }

}
