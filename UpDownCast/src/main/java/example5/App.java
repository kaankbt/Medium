package example5;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());
        A x;
        B y;

        x = val > 0 ? new A() : new B();
        System.out.println(x.getClass().getName());
        y = (B)x; //downcasting

        y.a = 10;
        y.b = 30;
    }
}

class B extends A {
    public int b;
}

class A {
    public int a;
}

