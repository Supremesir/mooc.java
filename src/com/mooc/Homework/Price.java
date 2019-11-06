package com.mooc.Homework;

import java.util.Scanner;

interface UnitPrice
{
    public double unitprice( ); //返回商品的单价
}

class TV implements UnitPrice {
    private double tv_price = (double) 8000;
    public double unitprice() {
        return tv_price;
    }
}

class PC implements UnitPrice {
    private double pc_price = (double) 10000;
    public double unitprice() {
        return pc_price;
    }
}

class Phone implements UnitPrice {
    private double phone_price = (double) 5000;
    public double unitprice() {
        return phone_price;
    }
}

public class Price {
    static double get(UnitPrice u) {
        return u.unitprice();
    }
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电视，电脑，手机的数量：");
            int a,b,c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            TV tv = new TV();
            PC pc = new PC();
            Phone phone = new Phone();
            var sum = a * get(tv) + b * get(pc) + c * get(phone);
            System.out.println("总价是："+(double)sum);
        }

    }
}
