package example3;

class App {
    public static void main(String[] args) {
        A x = new A();
        B y = new B();
        C z = new C();
        D t = new D();

        Sample.doWork(x); //upcasting
        Sample.doWork(y); //upcasting
        Sample.doWork(z); //upcasting
        Sample.doWork(t); //upcasting
    }
}

class Sample {
    public static void doWork(A a) {
        ++a.a;
    }
}

class D extends A {
    //...
}

class C extends B {
    //...
}

class B extends A {
    public int b;
    //...
}

class A {
    public int a;
}
