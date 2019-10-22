package codeforces;

import java.util.Scanner;

public class GeorgeAndAccommodation_467A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int cnt=0;
        
        for(int i=0;i<test;i++){
            int p = input.nextInt();
            int q = input.nextInt();
            
            if(q-p>=2)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}
