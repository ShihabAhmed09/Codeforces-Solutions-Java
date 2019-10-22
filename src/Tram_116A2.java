package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Tram_116A2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int sum = 0;
        int arr[] = new int[test];
        
        for(int i=0;i<test;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            
            sum = sum - a + b;
            
            arr[i] = sum;
        }
        
        Arrays.sort(arr);
        System.out.println(arr[test-1]);
    }
}
