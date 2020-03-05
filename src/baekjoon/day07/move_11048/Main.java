package baekjoon.day07.move_11048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[N+1][M+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                map[i][j] = sc.nextInt();

            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
               map[i][j] += Math.max(Math.max(map[i-1][j],map[i][j-1]),map[i-1][j-1]);
            }
        }


        System.out.println(map[N][M]);

    }
}
