package com.mooc.Homework;

import java.util.Scanner;

public class NumCompute {

    int a,b;
    int sum(int a,int b){
        return a+b;
    }
    double divide(int a,int b){
        return (double) a/(double) b;
    }
    public static void main(String[] args) {
        NumCompute numCompute = new NumCompute();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入两个整数：");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("请输入你要选择的功能：\n 1.加法\t2.除法");
            switch (scanner.nextInt()) {
                case 1: System.out.println(numCompute.sum(a,b));    break;

                case 2: System.out.println(numCompute.divide(a,b)); break;
                default: break;
            }
        }
    }

}
