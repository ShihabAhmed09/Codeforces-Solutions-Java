package codeforces;

import java.util.Scanner;

public class UltraFastMathematician_61A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s1 = input.next();
        String s2 = input.next();
        
        String s3[] = new String[s1.length()]; //for output
        
        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s3[i] = "0";
            }
            else{
                s3[i] = "1";
            }
        }
        for(String x : s3){
            System.out.print(x);
        }
        System.out.println();
    }
}
