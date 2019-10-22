package codeforces;

import java.util.Scanner;

public class CalculatingFunction_486A_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        long a = input.nextLong();
        long sum;
        
        if(a%2==0){
            sum = a/2;
        }
        else
            sum = -(a+1)/2;
        
        System.out.println(sum);
    }
}
