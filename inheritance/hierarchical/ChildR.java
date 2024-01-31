package com.qspider.inheritance.hierarchical;

public class ChildR extends Parent
{
    String cr = "Child Right";

    public void toChildR()
    {
        System.out.println("Hello From Child Right");
    }

    public static void main(String[] args) {
        // With the help of parent class object reference we can only access parents members
        Parent p = new Parent();
        System.out.println(p.pname);
        p.toParent();
        System.out.println("-----------------------------------------------");

        // With the help of Child Left class object reference we can access Parents as well as Child Left members

        ChildL cl = new ChildL();
        System.out.println(cl.cl);
        cl.toChildl();
        System.out.println(cl.pname);
        cl.toParent();

        System.out.println("===============================================================");

        //With the help of Child Left class object reference we can access Parents as well as Child Right members

        ChildR cr = new ChildR();
        System.out.println(cr.cr);
        cr.toChildR();
        System.out.println(cr.pname);
        cr.toParent();
    }
}
