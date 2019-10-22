package codeforces;

import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s,s1;
        
        s=input.next();
        
        s1=s.substring(0, 1).toUpperCase()+s.substring(1);
        //it changes the first character to capital and adds the remaining
        //one without no change
        System.out.println(s1);
    }
}
