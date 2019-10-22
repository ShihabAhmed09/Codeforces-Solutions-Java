package codeforces;

import java.util.Scanner;

public class Bit_282A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int X=0;
        for(int i=0;i<n;i++){
            String x = input.next();
            if(x.equals("X++")){
                X++;
            }
            else if(x.equals("++X")){
                ++X;
            }
            else if(x.equals("X--")){
                X--;
            }
            else if(x.equals("--X")){
                --X;
            }
        }
        System.out.println(X);
    }
}
