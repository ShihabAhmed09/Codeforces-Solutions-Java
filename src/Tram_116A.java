package codeforces;

import java.util.Scanner;

public class Tram_116A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int sum = 0;
        int temp = sum;
        
        for(int i=0;i<test;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            
            sum = sum - a + b;
            
            if(sum > temp)
                temp = sum;
        }
        
        System.out.println(temp);
    }
}
