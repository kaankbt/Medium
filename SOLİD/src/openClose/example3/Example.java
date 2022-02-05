package openClose.example3;

public class Example {
    public static void main(String[] args) {

    }
}

class CustomerManager {
    public void Add() {

        CustomerDal customerDal = new CustomerDal();
        customerDal.Add(Database.Oracle);
    }

}

class CustomerDal {
    public void Add(Database database) {
        if (database == Database.Oracle) {
            System.out.println("Added to pracle database");
        } else {
            System.out.println("Added to sql database");
        }
        // JPA CODES
    }
}

enum Database {
    Oracle, SqlServer
}