package codeforces;

import java.util.Scanner;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        input.nextLine();
        String s;
        s = input.nextLine().toLowerCase();
        
        if(a==s.length()){
            boolean contain= (s.contains("a") && s.contains("b") && s.contains("c")&& s.contains("d") && s.contains("e") && s.contains("f") 
                && s.contains("g") && s.contains("h") && s.contains("i")
                && s.contains("j") && s.contains("k") && s.contains("l")
                && s.contains("m") && s.contains("n") && s.contains("o")
                && s.contains("p") && s.contains("q") && s.contains("r")
                && s.contains("s") && s.contains("t") && s.contains("u")
                && s.contains("v") && s.contains("w") && s.contains("x")
                && s.contains("y") && s.contains("z"));
        if(contain==true)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
    }
}
