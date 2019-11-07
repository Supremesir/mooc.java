//第7章 输入/输出流

package com.mooc.Homework;

import java.io.*;
import java.util.Scanner;

public class FileWork {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1, file2, text=null;
        System.out.println("请输入文件1的路径：");
        file1 = scanner.nextLine();//此处若用next()会造成回车残留
        FileWriter fileWriter1 = new FileWriter(file1);

        while (true) {
            System.out.println("请输入学生姓名，数学成绩，计算机成绩，用空格隔开");
            text = scanner.nextLine();
            if (text.equals("finish")) {
                break;
            }
            fileWriter1.write(text+"\n");
            fileWriter1.flush();//强制将缓冲区中的内容发送出去，而不用等到缓冲区满
        }
        fileWriter1.close();
        System.out.println("请输入文件2的路径：");
        file2 = scanner.next();
        FileWriter fileWriter2 = new FileWriter(file2);
        FileInputStream fileInputStream = new FileInputStream(file1);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.indexOf("张") == 0) {
                fileWriter2.write(line+"\n");
                fileWriter2.flush();//强制将缓冲区中的内容发送出去，而不用等到缓冲区满
            }
        }
        fileWriter2.close();

    }
}
