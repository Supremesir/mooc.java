package com.mooc.Homework;

import java.util.Scanner;

abstract class ObjectVolume
{
    abstract double getVolume(); //返回物体的体积
}

class Sphere extends ObjectVolume{
    private int r =3;
    double getVolume(){
        return ((double)4/(double)3)*Math.PI*r*r*r;
    }
}

class Cube extends ObjectVolume {
    private int a=3,b=4,c=5;
    double getVolume(){
        return a*b*c;
    }
}

class Cylinder extends ObjectVolume{
    private int r=3;
    private int h=4;
    double getVolume() {
        return Math.PI*r*r*h;
    }

}

public class Volume{
    static void get(ObjectVolume obj) {
        System.out.println(obj.getVolume());
    }
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        ObjectVolume[] objectVolume = new ObjectVolume[3];
        objectVolume[0] = new Sphere();
        objectVolume[1] = new Cube();
        objectVolume[2] = new Cylinder();

        while (true) {
            System.out.println("请输入你要计算的体积：1.球体  2.立方体  3.圆柱体");
            int temp = scanner.nextInt();
            switch (temp) {
                case 1 :
                    System.out.print("球体的体积是：");
                    get(objectVolume[0]);
                    break;
                case 2 :
                    System.out.print("立方体的体积是：");
                    get(objectVolume[1]);
                    break;
                case 3:
                    System.out.print("圆柱体的体积是：");
                    get(objectVolume[2]);
                    break;
                default:
                    break;
            }
        }

    }
}