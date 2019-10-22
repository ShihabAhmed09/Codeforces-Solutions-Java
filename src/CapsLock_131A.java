package codeforces;

import java.util.Scanner;

public class CapsLock_131A {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s;
        s = input.nextLine();
        
        char b[] = s.toCharArray();
        int cnt=1,cnt2=0;
        
        for(int i=1;i<b.length;i++){
            if(b[i]>='A' && b[i]<='Z'){
                cnt++;
            }
            else
                cnt2++;
        }
        //System.out.println(cnt);
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            if(cnt==s.length())
                System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase());
            else
                System.out.println(s);
        }
        else if(cnt==s.length())
            System.out.println(s.toLowerCase());
        else
            System.out.println(s);
            
    }
}

