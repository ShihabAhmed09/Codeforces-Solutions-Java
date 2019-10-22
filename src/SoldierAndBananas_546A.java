package codeforces;

import java.util.Scanner;

public class SoldierAndBananas_546A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=w;i++){
            sum = sum + k*i;
        }
        if(sum>n)
            System.out.println(sum-n);
        else
            System.out.println(0);
   }
}
