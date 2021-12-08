package example2;

class App {
    public static void main(String[] args) {
        B x = new B();
        A y;

        x.a = 10;
        x.b = 34;

        y = x;

        System.out.printf("y.a = %d%n", y.a);
        System.out.printf("x.a = %d%n", x.a);

        y.a *= 2;
        System.out.printf("y.a = %d%n", y.a);
        System.out.printf("x.a = %d%n", x.a);
    }
}

class B extends A {
    public int b;
    //...
}

class A {
    public int a;
}