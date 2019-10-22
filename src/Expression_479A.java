package codeforces;

import java.util.Scanner;

public class Expression_479A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int result=a+b+c;
        
        result = Math.max(result,(a+b)*c);
        result = Math.max(result, a*(b+c));
        result = Math.max(result, a*b*c);
        
        System.out.println(result);
    }
}
