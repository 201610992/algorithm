package baekjoon.day06.stairup_2579;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] stair = new int[num+1];
        for(int i=1;i<=num;i++){
            stair[i] = sc.nextInt();
        }
        int[] dp = new int[num+1];
        dp[1] = stair[1];
        if(num>=2) dp[2] = dp[1]+stair[2];

        int nojump = 0;
        int jump = 0;
        for(int i=3;i<=num;i++){
            nojump = stair[i]+stair[i-1]+dp[i-3];
            jump = stair[i]+dp[i-2];

            dp[i] = Math.max(nojump,jump);
        }

        System.out.println(dp[num]);


    }
}
