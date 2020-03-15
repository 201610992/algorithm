package baekjoon.day07.coin1_2293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coin = new int[n+1];
        int[] dp = new int[k+1];
        for(int i=1;i<=n;i++){
            coin[i] = sc.nextInt();
        }
        dp[0] = 1; //동전을 아예 사용 안하는 경우 하나
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){ //j를 0으로 해도 정답
                if(j-coin[i] >= 0){
                    dp[j] += dp[j-coin[i]];
                }
            }
        }
        System.out.println(dp[k]);

    }
}
