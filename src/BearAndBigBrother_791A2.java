package codeforces;

import java.util.Scanner;

public class BearAndBigBrother_791A2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        int cnt = 0;
        
        for(int i=0;a<=b;i++){
            a=a*3;
            b=b*2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
