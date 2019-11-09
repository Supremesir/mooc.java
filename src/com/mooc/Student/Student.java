package com.mooc.Student;

import java.util.Scanner;

public class Student {


    public int num;
    public String name;
    public double ma_grade;
    public double co_grade;

    Student(int num, String name, double ma_grade, double co_grade) {
        this.num = num;
        this.name = name;
        this.ma_grade = ma_grade;
        this.co_grade = co_grade;
    }

    void print() {
        System.out.println("学号：" + num);
        System.out.println("姓名：" + name);
        System.out.println("数学成绩：" + ma_grade);
        System.out.println("计算机成绩：" + co_grade);
    }

    void setNum(int num) {
        this.num = num;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMa_grade(double ma_grade) {
        this.ma_grade = ma_grade;
    }

    void setCo_grade(double co_grade) {
        this.co_grade = co_grade;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getMa_grade() {
        return ma_grade;
    }

    double getCo_grade() {
        return co_grade;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号：");
        int num = scanner.nextInt();
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入数学成绩：");
        double ma_grade = scanner.nextDouble();
        System.out.println("请输入计算机成绩：");
        double co_grade = scanner.nextDouble();

        Student student = new Student(num, name, ma_grade, co_grade);
        student.print();
        scanner.close();
    }


}
