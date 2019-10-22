package codeforces;

import java.util.Scanner;
import java.math.*;

public class TaymyrIsCallingYou_764A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BigInteger n = input.nextBigInteger();
        BigInteger m = input.nextBigInteger();
        BigInteger z = input.nextBigInteger();
        
        BigInteger lcm = (n.multiply(m)).divide(n.gcd(m));
        //System.out.println(lcm);
        System.out.println(z.divide(lcm));
    }
}
