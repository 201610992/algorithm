package baekjoon.day08.ascendingnum_11057;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] dp = new int[num+1][10];

        for(int i=0;i<=9;i++){
            dp[1][i] = 1;
        }

        for(int i=2;i<=num;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=j;k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        int answer = 0;
        for(int i=0;i<=9;i++){
            answer += dp[num][i];
        }

        System.out.println(answer%=10007);
    }
}