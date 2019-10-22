package codeforces;

import java.util.Scanner;

public class Pangram_520A2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a,cnt=0;
        
        a = input.nextInt();
        
        String s = input.next().toLowerCase();
        char b[] = s.toCharArray();
        
        char c[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(b[j]==c[i])
                {
                    cnt++;
                    break;
                }
                
            }
        }
        if(cnt==26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
