package com.atguigu.controller.duotai;

/**
 * @Author: liyinghai
 * @Date: 2021/3/4 16:15
 */
public abstract class Student {
    public abstract void study();
    public void sleep() {
        System.out.println("睡觉");
    }
}

class baseStudent extends  Student {

    @Override
    public void study() {

    }

    @Override
    public void sleep() {
        System.out.println("base 睡觉");
    }
}

class AdvStudent extends Student {

    @Override
    public void study() {

    }
}

class studentDemo {
    public static void main(String[] args) {
        Student s1 = new baseStudent();
        Student s2 = new AdvStudent();
        s1.sleep();
        s2.sleep();
    }
}
