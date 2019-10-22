package codeforces;

import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String n = input.nextLine();
        
        char b[] = n.toCharArray();
        
        int cnt = 0;
        
        for(int i=0;i<b.length;i++){
            if(b[i]=='4' || b[i]=='7')
                cnt++;
        }
        //System.out.println(cnt);
        if(cnt==4 || cnt==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
