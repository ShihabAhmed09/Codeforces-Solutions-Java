package codeforces;

import java.util.Scanner;

public class UltraFastMathematician_61A_2 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s1 = input.next();
        String s2 = input.next();
        
        String s3 = ""; //for output
        
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s3 = s3+0;
            }
            else{
                s3 = s3+1;
            }
        }
        System.out.println(s3);
    }
}
