package codeforces;

import java.util.Scanner;

public class BoyOrGirl_236A {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char b[] = s.toCharArray();

        int count=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(b[i]==b[j]){
                    count++;
                    break;
                }
            }
        }
        if((b.length-count)%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
