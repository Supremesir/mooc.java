package com.mooc.Student;

class Student {
    protected String name;
    Student() {
    }

    Student(String name) {
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
}


class UnderGraStu extends Student {
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
}

class GraStu extends Student {
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
}

public class TestStu1 {
    public static void main(String[] args) {
        Student student = new Student("student");
        student.printInfo();
        student.setName("student1");
        student.printInfo();
        UnderGraStu underGraStu = new UnderGraStu();
        underGraStu.setName(student.getName());
        underGraStu.setGpa(60.233);
        underGraStu.printInfo();
        GraStu graStu = new GraStu();
        graStu.setName("student2");
        graStu.setTutor("teacher2");
        graStu.printInfo();
    }
}
