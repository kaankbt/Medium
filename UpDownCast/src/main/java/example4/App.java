package example4;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        double val = Double.parseDouble(kb.nextLine());

        try {
            double result = MathUtil.myLog(val);

            System.out.printf("log(%f)=%f%n", val, result);
        } catch (MyException ex) {
            System.out.println("My Exception yakalandı");
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class MathUtil {
    public static double myLog(double val) {
        if (val < 0)
            throw new MyException();

        if (val == 0)
            throw new YourException();

        return Math.log(val);
    }
}


class MyException extends RuntimeException {
    //...
}

class YourException extends MyException {
    //...
}
