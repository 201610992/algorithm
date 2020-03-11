package baekjoon.day08.downhillroad_1520;

import java.util.Scanner;

public class Main {

    static int[][] map;
    static int[][] memorization;
    static int M;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        map = new int[M+1][N+1];
        memorization = new int[M+1][N+1];

        for(int i=1;i<=M;i++){
            for(int j=1;j<=N;j++){
                map[i][j] = sc.nextInt();
            }
        }


    }



}

