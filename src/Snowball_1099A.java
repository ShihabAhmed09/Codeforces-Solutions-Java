package codeforces;

import java.util.Scanner;

public class Snowball_1099A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int w = input.nextInt();
        int h = input.nextInt();
        int u1 = input.nextInt();
        int d1 = input.nextInt();
        int u2 = input.nextInt();
        int d2 = input.nextInt();
        
        while(h>0){
            if(h==d1){
                w=w+h;
                w=w-u1;
                h=h-1;
                if(w<0)
                    w=0;
            }
            else if(h==d2){
                w=w+h;
                w=w-u2;
                h=h-1;
                if(w<0)
                    w=0;
            }
            else{
                w=w+h;
                h--;
                if(w<0)
                    w=0;
            }
        }
        System.out.println(w);
    }
}
