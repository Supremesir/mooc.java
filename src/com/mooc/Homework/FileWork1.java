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
        long cur = 0, last = 0;
        String file, old_text, new_text;
        System.out.println("请输入要处理的文件名：");
        Scanner scanner = new Scanner(System.in);
        file = scanner.nextLine();

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        while ((new_text = randomAccessFile.readLine()) != null) {
            cur = randomAccessFile.getFilePointer();
            if (new_text.contains("lishan")) {
                String str = new_text.replace("lishan", "wangshan");
                randomAccessFile.seek(last);
                randomAccessFile.writeBytes(str);

            }
            last = cur-1;
            //randomAccessFile.seek(last);
        }
        randomAccessFile.close();

    }
}
