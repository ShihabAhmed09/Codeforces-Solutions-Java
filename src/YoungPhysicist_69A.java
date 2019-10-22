package codeforces;

import java.util.Scanner;

public class YoungPhysicist_69A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        
        int suma=0,sumb=0,sumc=0;
        
        for(int i=0;i<test;i++){
            int a = input.nextInt();
            suma = suma+a;
            int b = input.nextInt();
            sumb = sumb+b;
            int c = input.nextInt();
            sumc = sumc+c;          
        }
        /*System.out.println(suma);
        System.out.println(sumb);
        System.out.println(sumc);*/
        if(suma==0 && sumb==0 && sumc==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
