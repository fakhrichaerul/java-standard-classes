package fakhri.java.standard.classes;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("APP"));

        System.exit(2);

        System.out.println("Print tidak dicetak karna system sudah exit");
    }
}
