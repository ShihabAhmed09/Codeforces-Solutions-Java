package codeforces;

import java.util.Scanner;

public class StonesOnTheTable_266A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        
        String s = input.next();
        char b[] = s.toCharArray();
        
        int count = 0;
        
        for(int i=1;i<b.length;i++){
            if(b[i]==b[i-1])
                count++;
        }
        System.out.println(count);
    }
}
