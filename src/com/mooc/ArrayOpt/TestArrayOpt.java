package com.mooc.ArrayOpt;

import java.util.Scanner;

public class TestArrayOpt {

    public static void main(String[] args) {
        System.out.println("请输入一串整数，用空格分割:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int[] array = new int[s1.length];
        for(int i=0;i<s1.length;i++) {
            array[i] = Integer.parseInt(s1[i]);
        }
        ArrayOpt arrayOpt = new ArrayOpt(array);
        arrayOpt.min();
        System.out.println("最小值是：" + arrayOpt.min_number+"\n最小值的位置是："+arrayOpt.min_location);
        arrayOpt.aver();
        System.out.println("平均值是：" + arrayOpt.average);

    }

}
