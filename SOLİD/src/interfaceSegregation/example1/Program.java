package interfaceSegregation.example1;

public class Program {
    public static void main(String[] args) {

    }
}

class CompanyWorker implements IWorker {

    public void Pay() {
        //..
    }

    public void Food() {
        //..
    }

    public void Work() {
        //..
    }
}

class OutsourceWorker implements IWorker {


    public void Pay() {
        //..
    }

    public void Food() {
        //!!!!!!
    }

    public void Work() {
        //..
    }
}

interface IWorker {
    void Pay();

    void Food();

    void Work();

}