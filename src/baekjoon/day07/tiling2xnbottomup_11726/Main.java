package baekjoon.day07.tiling2xnbottomup_11726;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[1001];

        memo[1] = 1;
        memo[2] = 2;

        for(int i=3;i<=n;i++){
            memo[i] = memo[i-2]+memo[i-1];
            memo[i]%=10007;
        }
        bw.write(String.valueOf(memo[n]));
        bw.flush();
    }
}
