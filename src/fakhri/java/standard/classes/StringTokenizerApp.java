package fakhri.java.standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Fakhri Chaerul Insan";

        StringTokenizer tokenizer = new StringTokenizer(value, ",");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }



    }
}
