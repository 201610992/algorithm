package baekjoon.day05.chonsu_2644;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n,m,start,end,ans;
    static int[][] a = new int[101][101];
    static int[] d = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        start = sc.nextInt();
        end = sc.nextInt();
        m = sc.nextInt();

        for(int i=0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x][y] = a[y][x] = 1;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int next = q.poll();
            for(int i=1;i<=n;i++){
                if(a[next][i]==0 || d[i]!=0) continue;
                d[i]=d[next]+1;
                q.add(i);
            }
        }

        System.out.println(d[end]==0?-1:d[end]);

    }


}

