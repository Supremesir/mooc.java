package com.mooc.Student;

abstract class Student1 {
    protected String name;

    Student1() {
    }

    Student1(String name) {
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

    abstract void study();
}


class UnderGraStu1 extends Student1 {
    private double gpa;

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void printInfo() {
        System.out.println("name:"+super.name+",gpa:"+gpa);
    }

    public void study() {
        System.out.println("做实验");
    }
}

class GraStu1 extends Student1 {
    private String tutor;

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTutor() {
        return tutor;
    }

    public void printInfo() {
        System.out.println("name:"+super.name+",tutor:"+tutor);
    }

    public void study() {
        System.out.println("做项目");
    }
}

public class TestStu2 {
    public static void main(String[] args) {
        UnderGraStu1 underGraStu1 = new UnderGraStu1();
        underGraStu1.setName("student1");
        underGraStu1.setGpa(60.233);
        underGraStu1.printInfo();
        underGraStu1.study();
        GraStu1 graStu1 = new GraStu1();
        graStu1.setName("student2");
        graStu1.setTutor("teacher2");
        graStu1.printInfo();
        graStu1.study();
    }
}
