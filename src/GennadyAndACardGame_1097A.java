package codeforces;

import java.util.Scanner;

public class GennadyAndACardGame_1097A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s = input.next().toLowerCase();
        String a = input.next().toLowerCase();
        String b = input.next().toLowerCase();
        String c = input.next().toLowerCase();
        String d = input.next().toLowerCase();
        String e = input.next().toLowerCase();
        
        if(s.charAt(0)==a.charAt(0) || s.charAt(1)==a.charAt(1))
            System.out.println("YES");
        else if(s.charAt(0)==b.charAt(0) || s.charAt(1)==b.charAt(1))
            System.out.println("YES");
        else if(s.charAt(0)==c.charAt(0) || s.charAt(1)==c.charAt(1))
            System.out.println("YES");
        else if(s.charAt(0)==d.charAt(0) || s.charAt(1)==d.charAt(1))
            System.out.println("YES");
        else if(s.charAt(0)==e.charAt(0) || s.charAt(1)==e.charAt(1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
