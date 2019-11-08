package com.mooc;

/**
 * @author HaoFan Fang
 * @date 2019/11/9 07:00
 */

/**
 * 覆盖：子类重写父类的方法，要求方法名和参数类型完全一样(参数不能是子类)，返回值和异常比父类小或者相同(即为父类的子类)，访问修饰符比父类大或者相同。
 * 覆盖是对于实例方法而言的
 *
 * 隐藏：父类和子类拥有相同名字的属性或者方法（ 方法隐藏只有一种形式，就是父类和子类存在相同的静态方法）时，父类的同名的属性或者方法形式上不见了，实际是还是存在的。
 * 隐藏是对于静态方法和成员变量（静态变量和实例变量）而言的
 */

class Father {
    public String name = "父类的属性";

    public void Print1() {
        System.out.println("父类的实例方法");
    }

    public static void Print2() {
        System.out.println("父类的静态方法");
    }
}

class Son extends Father {
    public String name = "子类的属性（隐藏父类属性）"; //父类的属性被隐藏

    //对父类实例方法的重写（覆盖）
    public void Print1() {
        System.out.println("子类的实例方法（重写父类实例方法）");
    }

    //对父类静态方法的隐藏
    public static void Print2(){
        System.out.println("子类的静态方法（隐藏父类静态方法）");
    }
}



public class Hide {
    static public void  main(String []args) {
        Son son = new Son();  //子类实例化
        Father father = son;  //子类引用上转型，可能会造成重写和隐藏
        System.out.println(father.name);
        System.out.println(son.name);
        father.Print1();
        son.Print1();

        father.Print2();
        son.Print2();

    }
}
