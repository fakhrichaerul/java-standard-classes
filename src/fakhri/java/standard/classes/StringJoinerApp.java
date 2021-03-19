package fakhri.java.standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "[","]");

        joiner.add("Fakhri");
        joiner.add("Chaerul");
        joiner.add("Insan");

        String name = joiner.toString();
        System.out.println(joiner);
    }
}
