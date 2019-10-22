package codeforces;

import java.util.Scanner;

public class Word_59A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        char b[] = s.toCharArray();
        
        int cnt1=0,cnt2=0;
        
        for(int i=0;i<b.length;i++){
            if(b[i]>='A' && b[i]<='Z'){
                cnt1++;
            }
            else
                cnt2++;
        }
        if(cnt1>cnt2)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}