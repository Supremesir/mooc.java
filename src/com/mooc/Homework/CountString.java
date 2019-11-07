//第5章 常用类

package com.mooc.Homework;

import java.util.Scanner;

class CountSubString
{
    void countSubString(String s, String substring) //s代表整个字符串，substring代表子串
    {
        int count = 0, index = 0;
        while ((index = s.indexOf(substring,index))!= -1){
            index += substring.length();
            count++;
        }
        System.out.println("检索到"+count+"个"+substring);
    }
}

public class CountString {
    public static void main(String []args){
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=reader.nextLine();
        System.out.println("请输入你要检索的子串：");
        String substring=reader.nextLine();
        CountSubString a=new CountSubString();
        a.countSubString(s, substring);
    }
}
