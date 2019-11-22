package com.mooc.Homework;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/11/21 18:01
 */

class RWInfo{
    protected String ID;
    protected String name;
}

public class ThreadWork {

    public static void main(String args[])
    {
        new Thread(new ReadName(new RWInfo())).start();
    }
}

class ReadName implements Runnable {

    RWInfo r;
    ReadName(RWInfo r){
        this.r = r;
    }

    //读线程
    @Override
    public void run() {
        Scanner reader=new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入学号：");
            r.ID=reader.nextLine();
            if(r.ID.equals("finish"))
            {
                System.out.println("\n读线程和写线程工作结束！");
                reader.close();
                return;
            }
            System.out.println("请输入姓名：");
            r.name=reader.nextLine();
            //线程联合（将写线程强制加入读线程，读入姓名和ID结束后，加入写线程，写完后继续执行读线程）
            Thread write = new Thread(new WriteName(r));
            write.start();
            try {
                write.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class WriteName implements Runnable {

    RWInfo w;
    WriteName(RWInfo w){
        this.w = w;
    }

    //写线程
    @Override
    public void run() {
        if(w.ID.equals("finish"))
            return;
        System.out.println("输出学号："+w.ID+"，输出姓名："+w.name);
        System.out.println();
    }
}



