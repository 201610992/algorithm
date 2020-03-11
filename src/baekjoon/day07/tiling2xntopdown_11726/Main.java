package baekjoon.day07.tiling2xntopdown_11726;

import java.io.*;

public class Main {
    private static int[] memo;

    public static int tiling(int n){
        if(n>=0 && n<=2){
            memo[n] = n;
            return memo[n];
        }
        if(memo[n]>0){
            return memo[n];
        }
        memo[n] = tiling(n-1)+tiling(n-2);
        memo[n] %= 10007;

        return memo[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        memo = new int[n+1];

        int answer = tiling(n);

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
