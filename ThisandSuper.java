
/*  super() --> this method implictly present in every constructor not need 
to assign but when we call the 
paremetrizes consturctor then implement which shown */

/**
 * class A
 * {
 * public A()
 * {
 * super();
 * System.out.println("in A");
 * }
 * public A(int n)
 * {
 * super();
 * System.out.println("in A int");
 * }
 * }
 * class B extends A
 * {
 * public B()
 * {
 * // super();
 * super(5);
 * System.out.println("in B");
 * }
 * public B(int n)
 * {
 * // super(); //call default constructor of super class
 * super(n);
 * System.out.println("in B int");
 * }
 * }
 * public class Demo {
 * public static void main(String[] args)
 * {
 * 
 * B obj=new B();
 * // B obj=new B(5);
 * }
 * }
 **/

// this()
class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(); // call constructor of diffrent class which is extend
        System.out.println("in B");
    }

    public B(int n) {
        this(); // call constructor of same class
        System.out.println("in B int");
    }
}

public class ThisandSuper {
    public static void main(String[] args) {

        // B obj=new B();
        B obj = new B(5);
    }
}
