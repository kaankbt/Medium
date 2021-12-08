package example1;

class App {
    public static void main(String[] args) {
        B b = new B();
        A a;

        a = b; //upcasting

        //...
    }
}

class B extends A {
    public int y;
    //...
}

class A {
    public int x;
}




