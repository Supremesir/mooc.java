package com.mooc.Homework;

import java.util.*;

class Student
{
    String name;
    int computerScore;
    Student(String name, int computerScore)
    {
        this.name=name;
        this.computerScore=computerScore;
    }
}

public class TryList {
    public static void main(String[] args) {
        LinkedList<Student> mylist = new LinkedList<>();
        Scanner reader=new Scanner(System.in);
        String temp_name = null;
        int temp_score = 0;
        while(true)
        {
            System.out.println("请输入学生姓名和计算机成绩，中间用回车隔开：");
            temp_name = reader.next();
            if(temp_name.equals("finish"))
                break;
            temp_score = reader.nextInt();
            Student student = new Student(temp_name, temp_score);
            mylist.add(student);
        }
        System.out.println("按计算机成绩升序排列：\n" +"Name      ComputerScore  \n" +
                "-----------------------------------------");
        Collections.sort(mylist, (arg0, arg1) -> arg0.computerScore - arg1.computerScore);
        Iterator<Student> iterator = mylist.iterator();
        while (iterator.hasNext()) {
            Student te = iterator.next();
            System.out.println("学生姓名：" + te.name + "\t计算机成绩：" + te.computerScore);
        }
        System.out.println("\n\n按姓名升序排列：\n" +"Name        ComputerScore  \n" +
                "-----------------------------------------");
        Collections.sort(mylist, (arg0, arg1) -> arg0.name.compareTo(arg1.name));
        Iterator<Student> iterator1 = mylist.iterator();
        while (iterator1.hasNext()) {
            Student te = iterator1.next();
            System.out.println("学生姓名：" + te.name + "\t计算机成绩：" + te.computerScore);
        }
    }
}
