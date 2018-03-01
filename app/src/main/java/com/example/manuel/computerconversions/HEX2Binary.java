package com.example.manuel.computerconversions;

/**
 * Created by Manuel on 2/28/2018.
 */


import java.math.BigInteger;
public class HEX2Binary{

    public String hexConvertor( String toBin){
        int lenBin = toBin.length() * 4;
        int i = Integer.parseInt(toBin,16);
        String bin = Integer.toBinaryString(i);

        if(bin.length() < lenBin ){
            int diff = lenBin - bin.length();
            
        }

        // do we need to pad with zeros

        return bin;
     //   return new BigInteger(toBin,16).toString(2);
    }
}
