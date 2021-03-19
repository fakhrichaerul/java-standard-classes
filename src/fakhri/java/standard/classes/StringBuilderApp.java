package fakhri.java.standard.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Fakhri");
        builder.append(" ");
        builder.append("Chaerul");
        builder.append(" ");
        builder.append("Insan");

        String name = builder.toString();
        System.out.println(name);
    }
}
