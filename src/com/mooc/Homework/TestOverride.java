package com.mooc.Homework;

class Teacher {
    private int TeacherNum;
    private String TeacherName;


    Teacher(int teacherNum, String teacherName) {
        TeacherNum = teacherNum;
        TeacherName = teacherName;
    }

    @Override
    public String toString() {
        String info = "教师号"+TeacherNum+"教师姓名"+TeacherName;
        return info;
    }
}

class Course {
    private int CourseNum;
    private String CourseName;
    Teacher teacher;


    Course(int courseNum, String courseName,Teacher t) {
        CourseNum = courseNum;
        CourseName = courseName;
        teacher = t;
    }

    @Override
    public String toString() {
        String info = "教师号"+CourseNum+"教师姓名"+CourseName+ teacher.toString();
        return info;
    }

    @Override
    public boolean equals(Object o) {
        Course t = (Course)o;
        if (t.CourseName.equals(CourseName)&&t.CourseNum==CourseNum) {
            return true;
        } else return false;
    }

}

public class TestOverride {

    public static void main(String []args) {
        Teacher teacher = new Teacher(1,"啊哈哈");
        Teacher teacher1 = new Teacher(1,"haha");
        Course course = new Course(2,"哈哈",teacher);
        Course course1 = new Course(2,"哈哈",teacher1);
        System.out.println(teacher.toString());
        System.out.println(teacher1.toString());
        System.out.println(course.toString());
        System.out.println(course1.toString());
        System.out.println(course.equals(course1));
    }
}
