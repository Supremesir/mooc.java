package com.mooc.TestStu;


import java.util.Scanner;

class Student2 {
    protected String name;

    Student2() {
    }

    Student2(String name) {
        this.name = name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void printInfo() {
        System.out.println("name:"+name);
    }

    protected void study(){
        System.out.println("学习");
    };
}


class UnderGraStu2 extends Student2 {
    private double gpa;

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void printInfo() {
        System.out.println(super.name+"是本科生");
    }

    public void study() {
        System.out.println(name+"做实验");
    }
}

class GraStu2 extends Student2 {
    private String tutor;

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void printInfo() {
        System.out.println(super.name+"是研究生");
    }

    public void study() {
        System.out.println(name+"做项目");
    }
}

public class TestStu3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int NUM = 2;
        Student2[] stu2 = new Student2[NUM];
        stu2[0] =  new UnderGraStu2();  //上转型
        stu2[1] = new GraStu2();
        //上转型对象不能使用子类新增成员(包括成员变量,成员方法),只能使用子类重写父类的方法,被子类隐藏的父类变量;子类未重写的父类方法,未被隐藏的父类成员变量.
        for (int i = 0; i < 2; i++) {
            stu2[i].setName(scanner.next());
            stu2[i].printInfo();
            stu2[i].study();
        }
    }
}
