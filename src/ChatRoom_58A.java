package codeforces;

import java.util.Scanner;

public class ChatRoom_58A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        String s = "hello";
        
        String s1 = input.nextLine();
        
        int a = 0;
        
        for(int i=0;i<s1.length();i++){
            if(s.charAt(a)==s1.charAt(i)){
               a++;
               if(a==5)
                   break;
            }
        }
        if(a==5){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
