package example3;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Islem islem = (var a, var b) -> a * b;

        System.out.println("Birinci sayıyı giriniz:");
        var x = kb.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        var y = kb.nextInt();


        System.out.println(islem.apply(x, y));
    }
}

interface Islem {
    int apply(int birinci, int ikinci);
}