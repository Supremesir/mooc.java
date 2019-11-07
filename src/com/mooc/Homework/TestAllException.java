//第6章 异常处理

package com.mooc.Homework;

import java.io.IOException;
import java.util.Scanner;



class MyException extends Exception {

    //国际惯例自定义异常类构造
    private static final long serialVersionUID = 1L;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }


}

public class TestAllException {

    public static double calculateArea(double a, double b) throws MyException {
        if (a >= 0.0 && b >= 0.0) {
            return a * b;
        } else {
            throw new MyException("输入的长宽数值不正确");
        }
        //判断什么时候声明异常
        //计算并且返回矩形面积
    }

    public static void main(String[] args) {
        //从键盘上接收矩形的长和宽
        System.out.println("请输入矩形的长和宽，用空格分割：");
        Scanner scanner = new Scanner(System.in);


            //调用 方法calculateArea
        try {
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            double area = calculateArea(length, width);
            //输出矩形面积
            System.out.println("矩形的面积为" + area);
        } catch (MyException e) {
            e.printStackTrace();
        }



        //对于上述操作，注意捕获可能出现的异常
    }
}
