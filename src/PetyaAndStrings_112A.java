package codeforces;

import java.util.Scanner;

public class PetyaAndStrings_112A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s1 = input.nextLine().toLowerCase();
        //char b[] = s1.toCharArray();
        String s2 = input.nextLine().toLowerCase();
        //char c[] = s2.toCharArray();
        
        /*String cnt="",cnt2="";
        
        for(int i=0;i<b.length;i++){
            if(s1.charAt(i)!=s2.charAt(i))
            {
                cnt=cnt+s1.charAt(i);
                cnt2=cnt2+s2.charAt(i);
            }
            
        }*/
        int a = s1.compareTo(s2);
        if(a>0)
            System.out.println("1");
        else if(a<0)
            System.out.println("-1");
        else
            System.out.println("0");
        
        
    }
}
