package com;


import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m[] = new int[n];
        for (int i=0;i<n;i++){
            m[i] = s.nextInt();
        }
        int b = s.nextInt();
        StringBuilder str = new StringBuilder();
        for (int k=0;k<m.length-1;k++){
            for (int i=0;i<m.length-1;i++){
                if (m[i]>m[i+1]){
                    int c = m[i];
                    m[i] = m[i+1];
                    m[i+1] = c;
                }
            }
        }

        for (int i=0;i<m.length;i++){
            str.append(m[i]).append(" ");
        }
        if (b==0){
            System.out.println(str);
        }else {
            System.out.println(str.reverse());
            System.out.println("www");
        }
    }
}
