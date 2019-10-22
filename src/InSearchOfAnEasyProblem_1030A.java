package codeforces;

import java.util.Scanner;

public class InSearchOfAnEasyProblem_1030A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int cnt=0;
        
        for(int i=0;i<n;i++){
            int a = input.nextInt();
            if(a==1)
                cnt++;
        }
        if(cnt>=1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
