package codeforces;

import java.util.Scanner;

public class AntonAndPolyhedrons_785A {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int test = input.nextInt();
        int sum = 0;
        
        for(int i=0;i<test;i++){
            String s = input.next();
            switch (s) {
                case "Tetrahedron":
                    sum = sum + 4;
                    break;
                case "Cube":
                    sum = sum + 6;
                    break;
                case "Octahedron":
                    sum = sum + 8;
                    break;
                case "Dodecahedron":
                    sum = sum + 12;
                    break;
                case "Icosahedron":
                    sum = sum + 20;
                    //System.out.println(sum);
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(sum);
    }
}
