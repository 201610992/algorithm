package baekjoon.day08.sumdecomposition_2225;

import java.util.Scanner;

public class Main {
    private static final int MOD = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] dp = new long[n+1][k+1];

        for(int i=1;i<=k;i++){
            dp[0][i] = 1;
            if(n>0){
                dp[1][i] = i;
            }
        }
        for(int i=1;i<=n;i++){
            dp[i][1] = 1;
        }

        for(int i=2;i<=n;i++){
            for(int j=2;j<=k;j++){
                for(int g=0;g<=j;g++){
                    dp[i][j] = (dp[i-1][g] + dp[i][j]) % MOD;
                }
            }
        }

        System.out.println(dp[n][k]);

    }
}
