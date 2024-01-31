package com.qspider.inheritance.multilevel;

public class Parent
{
    String pname = "Parent ";


    public void toParent()
    {
        System.out.println("Hello From Parent Class");

    }

    public static void main(String[] args) {
        // with the help of parent class object reference we can only access parents members
        Parent p = new Parent();
        System.out.println(p.pname);
        p.toParent();
        System.out.println("--------------------------------------------");

        //with the help of Child1 class object reference we can access parents as well as Child1 members
        Child1 c1 = new Child1();
        System.out.println(c1.c1);
        c1.toChild1();
        System.out.println(c1.pname);
        c1.toParent();

        System.out.println("--------------------------------------------");

        //with the help of Child2 class object reference we can access parents as well as Child1 ,Child2 members
        Child2 c2 = new Child2();
        System.out.println(c2.c2);
        c2.toChild2();
        System.out.println(c2.c1);
        c2.toChild1();
        System.out.println(c2.pname);
        c2.toParent();

        System.out.println("--------------------------------------------");

        //with the help of Child2 class object reference we can access parents as well as Child1 ,Child2,Child3 members
        Child3 c3 = new Child3();
        System.out.println(c3.c3);
        c3.toChild3();
        System.out.println(c3.c2);
        c3.toChild2();
        System.out.println(c3.c1);
        c3.toChild1();
        System.out.println(c3.pname);
        c3.toParent();



    }
}
