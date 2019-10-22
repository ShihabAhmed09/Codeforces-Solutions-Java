package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SoldierAndBadges_546B {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        int count=0;
        
        for (int i = 1; i < n; i++) {
            for(int j=0; j<i;j++){ //it will compare with all the values before i
                if(arr[j]==arr[i]){
                    arr[i]++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
