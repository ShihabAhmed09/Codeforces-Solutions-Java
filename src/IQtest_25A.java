package codeforces;

import java.util.Scanner;

public class IQtest_25A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        int pose=0,poso=0,i,cnt=1,cmt=1;
        
        for(i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        
        for(i=0;i<n;i++){
            if(a[i]%2!=0)
                poso=i;
            else
                cnt++;
        }
        
        for(i=0;i<n;i++){
            if(a[i]%2==0)
                pose=i;
            else
                cmt++;
        }
        if((n-1)==cnt)
            System.out.println(poso);
        else
            System.out.println(pose);
        
        
    }
}
