package codeforces;

import java.util.Scanner;

public class Team_231A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int cnt = 0;
        
        for(int i=0;i<test;i++){
            int p = input.nextInt();
            int v = input.nextInt();
            int t = input.nextInt();
            if(p+v+t>1)
                cnt++;
        }
        System.out.println(cnt);
    }
}
