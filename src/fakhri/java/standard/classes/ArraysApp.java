package fakhri.java.standard.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers =  {
                1, 2, 4, 12 , 122, 124, 344, 467, 635
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(Arrays.binarySearch(numbers, 467));
        // Data yang tidak ada di print -minus
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 2, 7);
        System.out.println(Arrays.toString(result2));
    }
}
