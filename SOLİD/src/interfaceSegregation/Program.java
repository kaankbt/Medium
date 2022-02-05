package interfaceSegregation;


public class Program {
    public static void main(String[] args) {

    }
}

class CompanyWorker implements IWorkable, IFoodable, IPayable {

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

class OutsourceWorker implements IWorkable, IPayable {


    public void Pay() {
        //..
    }

    public void Work() {
        //..
    }

}

interface IPayable {
    void Pay();

}

interface IWorkable {

    void Work();
}

interface IFoodable {

    void Food();
}
