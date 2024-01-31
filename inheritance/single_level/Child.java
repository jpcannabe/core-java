package com.qspider.inheritance.single_level;

import com.sun.tools.javac.Main;

public class Child extends Parent
{
    String cname = "Child";

    public void toChild()
    {
        System.out.println("Hello From Child Class");
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p.name);
        p.toParent();
        Child c = new Child();
        System.out.println(c.cname);
        System.out.println(c.name);
        c.toParent();
        c.toChild();

    }

}
