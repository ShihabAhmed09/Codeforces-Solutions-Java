package codeforces;

import java.util.Scanner;
import java.math.BigInteger;

public class CalculatingFunction_486A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BigInteger a = input.nextBigInteger();
        
        BigInteger sum;
        
        sum = a.add(BigInteger.ONE).multiply(a).divide(BigInteger.valueOf(2));
        //sum = a.add(new BigInteger("1")).multiply(a).divide(new BigInteger("2"));
        if(a.mod(new BigInteger("2")).equals(BigInteger.ZERO)) 
            System.out.println(sum.remainder(a));
        else {
            System.out.println(sum.divide(a).multiply(BigInteger.valueOf(-1)));
        }
    }
}
