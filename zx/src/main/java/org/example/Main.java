package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String ss=scanner.nextLine();
        String ss2=scanner.nextLine();
        System.out.println(ss);
        int sum=0;
        char[] abc={'a','b','c','d','e','f',
                'g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t',
                'u','v','w','x','y','z'};
        int [] abc2=new int[26];
        for (int i = 0; i <26 ; i++) {
            abc2[i]=0;
        }
        int [] abc3=new int[26];
        for (int i = 0; i <26 ; i++) {
            abc3[i]=0;
        }

       Map<Character,Integer> src = new HashMap<>();
        for (int i = 0; i <ss.length() ; i++) {
            int t=ss.charAt(i)-'a';
            System.out.println(t);
            abc2[t]++;
        }
        for (int i = 0; i <ss2.length() ;i++) {
            int t=ss2.toLowerCase().charAt(i)-'a';
            abc3[t]++;
        }
        for (int i = 0; i <abc2.length ; i++) {
            if (abc2[i]!=0 && abc3[i]!=0){
                sum++;
            }
        }
        System.out.println(sum);


    }
}