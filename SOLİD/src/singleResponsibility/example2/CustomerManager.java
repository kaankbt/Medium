package singleResponsibility.example2;

public class CustomerManager {
    public void TransactionalOperation() {
        Insert();
        Update();
    }

    public void Update() {
        MyContext context = new MyContext();

        context.Update(); // 1
    }

    public void Insert() {
        MyContext context = new MyContext();

        context.Insert(); // 2
    }
}

class PersonManager {
    public void Add() {
        CustomerManager customerManager = new CustomerManager();
        customerManager.TransactionalOperation(); // DONE!
    }
}

class MyContext {

    public void Update() { // 1

    }

    public void Insert() { // 2

    }
}