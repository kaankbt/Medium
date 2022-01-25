package example5;

public class App {
    public static void main(String[] args) {
        Selam s = () -> {
            return "Merhaba Dünya";
        };
        System.out.println(s.soyle());
    }

}

interface Selam {
    public String soyle();
}

