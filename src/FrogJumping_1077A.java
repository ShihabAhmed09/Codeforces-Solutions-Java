package codeforces;

import java.util.Scanner;

public class FrogJumping_1077A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        long test = input.nextLong();
        
        for (int i = 0; i < test; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            long k = input.nextLong();
            
            /*System.out.println((a*(k/2))-(b*(k/2)));
            (a - b) * 1ll * (k / 2) + a * (k & 1)*/
            if(k%2==0)
                System.out.println((a*(k/2))-(b*(k/2)));
            else
                System.out.println((a*((k+1)/2))-(b*(k/2)));
        }
    }
}
