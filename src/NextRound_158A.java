package codeforces;

import java.util.Scanner;

public class NextRound_158A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        int arr[] = new int[a];
        
        for(int i=0;i<a;i++){
            arr[i] = input.nextInt();
        }
        int count=0;
        int temp = arr[b-1];
        for(int i=0;i<a;i++){
            
            if(arr[i]>=temp && arr[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
