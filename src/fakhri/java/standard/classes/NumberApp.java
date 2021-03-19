package fakhri.java.standard.classes;

public class NumberApp {
    public static void main(String[] args) {


        Integer intValue = 10;

        Long longValue = intValue.longValue();
        ;
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String contoh = "10.00";

        Double contohDouble = Double.valueOf(contoh);
        System.out.println(contohDouble);
    }
}
