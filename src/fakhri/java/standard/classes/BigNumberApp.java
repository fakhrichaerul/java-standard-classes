package fakhri.java.standard.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10000000000000000000000000");
        BigInteger b = new BigInteger("10000000000000000000000000");

        BigInteger c = a.add(b);
        BigInteger d = b.mod(new BigInteger("10000000000000000000000000"));

        System.out.println(c);
        System.out.println(d);
    }
}
