package codeforces;

import java.util.Scanner;

public class TheatreSquare_1A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();
        
        int result = ((n+a-1)/a) * ((m+a-1)/a);
        
        System.out.println(result);
    }
}
