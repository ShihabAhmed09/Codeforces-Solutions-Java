package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Expression_479A_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int[] arr = new int[7];
        
        arr[1] = a+b+c;
        arr[2] = a+b*c;
        arr[3] = (a+b)*c;
        arr[4] = a*b*c;
        arr[5] = a*(b+c);
        arr[6] = a*b+c;
        /*System.out.println(arr[1] + " " + arr[2] + " " +arr[3] + " " + arr[4] + 
                " " + arr[5] + " " + arr[6]);*/
        Arrays.sort(arr);
        /*System.out.println(arr[1] + " " + arr[2] + " " +arr[3] + " " + arr[4] + 
                " " + arr[5] + " " + arr[6]);*/
        System.out.println(arr[6]);
    }
}
