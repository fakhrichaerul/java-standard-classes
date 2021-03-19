package fakhri.java.standard.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Fakhri Chaerul Insan";
        String nameLowerCase = name.toLowerCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("Fakhri"));
        System.out.println(name.endsWith("Chaerul"));

        String[] names = name.split(" ");
        for (String item : names) {
            System.out.println(item);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();
        System.out.println(chars);

    }
}
