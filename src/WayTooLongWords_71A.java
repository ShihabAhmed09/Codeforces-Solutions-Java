package codeforces;

import java.util.Scanner;

public class WayTooLongWords_71A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        for(int i=0;i<test;i++){
            String s = input.next();
        
            int len = s.length();
        
            if(len<=10)
                System.out.println(s);
            else{
                System.out.print(s.charAt(0));
                System.out.print(len-2);
                System.out.println(s.charAt(len-1));
            }
        }
            
    }
}
