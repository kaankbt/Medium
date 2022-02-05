package singleResponsibility.example1;

class Example {
    public static void main(String[] args) {

    }
}

class CustomerManager {
    public void TransactionalOperation() {
        MyContext context = new MyContext();

        context.Update(); // 1

        context.Insert(); // 2
    }
}

class PersonManager {
    public void Add() {
        CustomerManager customerManager = new CustomerManager();
        customerManager.TransactionalOperation(); // ERROR !
    }
}

class MyContext {

    public void Update() { // 1

    }

    public void Insert() { // 2

    }
}
