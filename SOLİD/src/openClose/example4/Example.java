package openClose.example4;

public class Example {
    public static void main(String[] args) {

    }
}

class CustomerManager implements ICustomerService {
    private final ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        _customerDal = customerDal;
    }

    public void Add() {
        _customerDal.Add();
    }

}

class JpaCustomerDal implements ICustomerDal {
    public void Add() {
        System.out.println("Added Byte Jpa");
    }
}

class HibernateCustomerDal implements ICustomerDal {
    public void Add() {
        System.out.println("Added Byte Hibernate");
    }
}

class SqlCustomerDal implements ICustomerDal {
    public void Add() {
        System.out.println("Added Byte SqlServer");
    }
}

interface ICustomerDal {
    void Add();
}

interface ICustomerService {
    void Add();
}
