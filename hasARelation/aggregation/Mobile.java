package com.qspider.hasARelation.aggregation;

public class Mobile
{
    String mcomp;
    double price;
    Sim s;
    public Mobile(String mcomp,double price)
    {
        this.mcomp=mcomp;
        this.price=price;
    }

    public void toCall(Sim s)
    {
        System.out.println(" Hiiiiiii toCall() ");
        System.out.println(s.sprovider);
        System.out.println(s.sno);
    }

    public static void main(String[] args)
    {
     Mobile m = new Mobile("Samsung",90000);
     m.toCall(new Sim("Idea",897));
        System.out.println(m.mcomp);
        System.out.println(m.price);

    }
}
