package codeforces;

import java.util.Scanner;

public class Magnets_344A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int count = 1;
        int temp = arr[0];
        
        for (int i = 1; i < n; i++) {
            if(temp != arr[i]){
                temp = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
