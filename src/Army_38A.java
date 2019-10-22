package codeforces;

import java.util.Scanner;

public class Army_38A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int a[] = new int[n];
        int sum=0;
        
        for(int i=1;i<n;i++){
            a[i] = input.nextInt();
        }
        
        int b = input.nextInt();
        int c = input.nextInt();
        
        for(int i=b;i<c;i++){
            sum = sum + a[i];
        }
        
        System.out.println(sum);
    }
}
