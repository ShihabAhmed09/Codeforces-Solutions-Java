package codeforces;

import java.util.Scanner;

public class AntonAndLetters_443A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        char b[] = s.toCharArray();
        
        int cnt=0;
        
        char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
            'p','q','r','s','t','u','v','w','x','y','z'};
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(b[j]==arr[i]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
