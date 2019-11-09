package com.mooc.Student;

import java.util.Scanner;

public class PostGraduate extends Student{

    public String te_name;
    public String research;

    PostGraduate(int num, String name, double ma_grade, double co_grade,String te_name,String research) {
        super(num, name, ma_grade, co_grade);
        this.num = num;
        this.name = name;
        this.ma_grade = ma_grade;
        this.co_grade = co_grade;
        this.te_name = te_name;
        this.research = research;
    }

    void print() {
        System.out.println("学号：" + num);
        System.out.println("姓名：" + name);
        System.out.println("数学成绩：" + ma_grade);
        System.out.println("计算机成绩：" + co_grade);
        System.out.println("导师姓名：" + te_name);
        System.out.println("研究方向：" + research);
    }

    void setTe_name(String te_name) {
        this.te_name = te_name;
    }

    void setResearch(String research) {
        this.research = research;
    }

    String getTe_name() {
        return te_name;
    }

    String getResearch() {
        return research;
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
        System.out.println("请输入教师姓名：");
        String te_name = scanner.next();
        System.out.println("请输入研究方向：");
        String research = scanner.next();

        PostGraduate postGraduate = new PostGraduate( num, name, ma_grade, co_grade, te_name, research);
        postGraduate.print();
    }
}
