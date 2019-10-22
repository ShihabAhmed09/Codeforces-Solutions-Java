package codeforces;

import java.util.Scanner;

public class APrank_1062A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int[] arr = new int[a];
        int cnt=0;
        
        for(int i=0;i<a;i++){
            arr[i] = input.nextInt();
        }
        
        /*for(int i=1;i<arr.length;i++){
            for (int j = i-1; j < i; j++) {
                if(arr[i]-arr[j]==1)
                    cnt++;
            }
        }*/
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-temp==1){
                cnt++;
                temp=arr[i];
            }
        }
        if(cnt>0)
            System.out.println(cnt);
        else
            System.out.println("0");
    }
}
