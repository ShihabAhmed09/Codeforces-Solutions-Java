package codeforces;

import java.util.Scanner;

public class BearAndBigBrother_791A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        int b1 = a*3;
        int b2 = b*2;
        
        int cnt = 1;
        
        for(int i=0;i<1000;i++){
            if(b1>b2)
                break;
            else{
                cnt++;
                b1=b1*3;
                b2=b2*2;
            }
        }
        System.out.println(cnt);
    }
}
