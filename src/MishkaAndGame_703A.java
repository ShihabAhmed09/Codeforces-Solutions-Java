package codeforces;

import java.util.Scanner;

public class MishkaAndGame_703A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int cnt1=0,cnt2=0;
                
        for(int i=0;i<test;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            
            if(a>b)
                cnt1++;
            else if(a<b)
                cnt2++;
            else
                continue;
        }
        
        if(cnt1>cnt2)
            System.out.println("Mishka");
        else if(cnt1<cnt2)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}
