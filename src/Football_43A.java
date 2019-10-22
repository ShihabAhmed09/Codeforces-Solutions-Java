package codeforces;

import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        
        String[] sh = new String[test];
        
        int cnt1=1,cnt=0;
        
        for(int i=0;i<sh.length;i++)
        { 
            sh[i] = input.next();
        }
        
        String sh1 = sh[0];
        String sh2="";
        
        for (int i = 0; i < sh.length-1; i++) {
            if(sh1.equals(sh[i+1])){
                cnt1++;
            }
            else{
                sh2=sh[i+1];
                cnt++;
            }
        }
        
        if(cnt1>cnt)
            System.out.println(sh1);
        else 
            System.out.println(sh2);
        
    }
}
