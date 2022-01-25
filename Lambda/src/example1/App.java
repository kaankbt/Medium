package example1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Islem islem = (x, y) -> {
            System.out.printf("a = %d, b = %d", x, y);

            return x + y;
        };

        System.out.println("Birinci sayıyı giriniz:");
        int a = kb.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int b = kb.nextInt();

        System.out.println(islem.topla(a, b));

    }
}

interface Islem {
    public int topla(int birinci, int ikinci);
}
