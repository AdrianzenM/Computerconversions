package com.example.manuel.computerconversions;

/**
 * Created by Manuel on 2/22/2018.
 */
import java.math.BigDecimal;
import java.math.BigInteger;

public class ToBinary {

    public String convert(double number) {
        int n = 10;
        BigDecimal bd = new BigDecimal(number);
        BigDecimal mult = new BigDecimal(2).pow(n);
        bd = bd.multiply(mult);
        BigInteger bi = bd.toBigInteger();
        StringBuilder str = new StringBuilder(bi.toString(2));
        while (str.length() < n+1) {
            str.insert(0, "0");
        }
        str.insert(str.length()-n, ".");
        return str.toString();
    }

}
