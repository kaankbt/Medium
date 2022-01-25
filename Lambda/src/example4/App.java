package example4;

public class App {
    public static void main(String[] args) {

        Selam s = (mesaj) -> {
            return "Selam, " + mesaj;
        };
        System.out.println(s.soyle("Dünya"));
    }

}

interface Selam {
    public String soyle(String mesaj);
}

