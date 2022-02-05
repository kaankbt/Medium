package openClose.example2;

public class Example {
    public static void main(String[] args) {

    }
}

class CustomerManager {
    public void Add() {
        CustomerDal customerDal = new CustomerDal();
        customerDal.Add();
    }

}

class CustomerDal {
    public void Add() {

        //JPA CODES
        System.out.println("Added to database");
    }
}
