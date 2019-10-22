package codeforces;

import java.util.Scanner;

public class Translation_41A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s1,s2;
        
        s1 = input.nextLine();
        s2 = input.nextLine();
        
        StringBuilder sb = new StringBuilder(s2);
        
        String s3 = sb.reverse().toString();
        
        if(s1.equalsIgnoreCase(s3))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
