package codeforces;

import java.util.Scanner;

public class InsomniaCure_148A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int m = input.nextInt();
        
        boolean arr[] = new boolean[m+1];
        
        for (int i = 1; i <= m; i++) {
            arr[i] = false;
        }
        //updating all multiples of a,b,c,d
        for (int i = a; i <= m; i=i+a) {
            arr[i] = true;
        }
        for (int i = b; i <= m; i=i+b) {
            arr[i] = true;
        }
        for (int i = c; i <= m; i=i+c) {
            arr[i] = true;
        }
        for (int i = d; i <= m; i=i+d) {
            arr[i] = true;
        }
        
        int count=0;
        //updated values are the result
        for (int i = 1; i <= m; i++) {
            if(arr[i])
                count++;
        }
        System.out.println(count);
    }
}
