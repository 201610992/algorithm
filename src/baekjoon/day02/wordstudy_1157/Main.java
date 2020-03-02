package baekjoon.day02.wordstudy_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();
        int[] count = new int[26];
        int max=0;
        char result = '?';

        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-65]++;
            if(max<count[word.charAt(i)-65]) {
                max = count[word.charAt(i) - 65];
                result = word.charAt(i);
            }else if(max == count[word.charAt(i)-65]){
                result = '?';
            }
        }
        System.out.println(result);



    }
}
