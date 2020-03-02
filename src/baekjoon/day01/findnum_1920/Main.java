package baekjoon.day01.findnum_1920;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++) {
            hs.add(sc.nextInt());
        }
        int M = sc.nextInt();
        int B[] = new int[M];
        for(int i=0;i<B.length;i++){
            B[i] = sc.nextInt();
        }

        for(int i=0;i<M;i++){
            if(hs.contains(B[i])){
                System.out.println('1');
            }
            else
                System.out.println('0');

        }









    }
}
