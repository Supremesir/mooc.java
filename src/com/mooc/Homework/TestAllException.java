package com.mooc.Homework;

import java.util.Scanner;

class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    // 提供无参数的构造方法
    public MyException() {
    }

    // 提供一个有参数的构造方法，可自动生成
    public MyException(String message) {
        super(message);// 把参数传递给Throwable的带String参数的构造方法
    }

}

public class TestAllException {

    public static double calculateArea(double a, double b) throws MyException{
        if (a >= 0.0 && b >= 0.0) {
            return a * b;
        } else {
            throw new MyException("输入的长宽数值不正确");
        }
        //判断什么时候声明异常
        //计算并且返回矩形面积

    }

    public static void main(String[] args) throws MyException {
        //从键盘上接收矩形的长和宽
        System.out.println("请输入矩形的长和宽，用空格分割：");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        //调用 方法calculateArea
        double area = calculateArea(length,width);

        //输出矩形面积
        try {
            System.out.println("矩形的面积为" + area);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //对于上述操作，注意捕获可能出现的异常
    }
}
