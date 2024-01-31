package com.qspider.hasARelation.composition;

public class Mobile {
    String mcomp;
    double price;
    Battery b;
    Mobile(String mcomp,double price,Battery b)
    {
        this.mcomp=mcomp;
        this.price=price;
        this.b=b;
    }


    public static void main(String[] args)
    {
        Mobile m = new Mobile("Mi",89900,new Battery("int",7876));
        System.out.println(m.mcomp);
        System.out.println(m.price);
        System.out.println(m.b.bcomp);
        System.out.println(m.b.bno);
    }
}
