package com.mooc.Homework;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/11/14 15:44
 */


public class FileWork1 {
    public static void main(String[] args) throws IOException {

        /**
         * 本程序基于上一个实验生成的文件（文件末尾要有回车）
         */

        String file;
        System.out.println("请输入要处理的文件名：");
        Scanner scanner = new Scanner(System.in);
        file = scanner.nextLine();

        while (true) {
            System.out.println("本程序的任务是：\n" +
                    "1.将" + file + "中姓名\"hello\"改为\"where\"\n" +
                    "2.在" + file + "原有信息后继续添加信息\n" +
                    "输入finish结束程序");
            String t = scanner.next();
            if (t.equals("finish")) {
                break;
            }
            switch (t) {
                case "1":
                    //每次都进行打开关闭文件操作，保证文本正常从头到尾读取
                    RandomAccessFile randomAccessFile0 = new RandomAccessFile(file, "rw");
                    change_name(randomAccessFile0);
                    randomAccessFile0.close();
                    break;
                case "2":
                    RandomAccessFile randomAccessFile1 = new RandomAccessFile(file, "rw");
                    add_content(randomAccessFile1);
                    randomAccessFile1.close();
                    break;
                default:
                    break;
            }
        }
    }

     private static void change_name(RandomAccessFile randomAccessFile) throws IOException{
        long cur = 0, last = 0;
        String text;
        while ((text = randomAccessFile.readLine()) != null) {
            //获取每行末指针位置
            cur = randomAccessFile.getFilePointer();
            if (text.contains("hello")) {
                //此处要求target和replacement文字长度保持一致，否则会导致指针位置偏差
                String str = text.replace("hello", "where");
                //移动指针到待修改行开头
                randomAccessFile.seek(last);
                //覆盖该行并添加换行
                randomAccessFile.writeBytes(str+"\n");
            }
            //更新指针位置
            last = cur;
        }

    }

    private static void add_content(RandomAccessFile randomAccessFile) throws IOException {

        //获取文本末尾指针位置
        long cur = randomAccessFile.length();
        String text;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生姓名，数学成绩，计算机成绩，用空格隔开，输入finish结束");
            text = scanner.nextLine();
            if (text.equals("finish")) {
                break;
            }
            //移动指针到文章末尾
            randomAccessFile.seek(cur);
            //给text添加换行
            text = text + "\n";
            randomAccessFile.writeBytes(text);
            //更新指针位置
            cur = cur + text.length();
        }



    }

}
