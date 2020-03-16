package baekjoon.day10.mirosearchbfs_onemore_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            String temp = sc.next();
            for(int j=0;j<M;j++){
                map[i][j] = temp.charAt(j)-48;
            }
        }

        bfs(new dot(0,0));
        System.out.println(map[N-1][M-1]);

    }
    public static void bfs(dot d){
        Queue<dot> q = new LinkedList<>();
        q.add(d);
        while (!q.isEmpty()){
            d = q.poll();
            for(int i=0;i<4;i++){
                int x2 = d.x+dx[i];
                int y2 = d.y+dy[i];

                if(x2>=0 && y2>=0 && x2<N && y2<M){
                    if(map[x2][y2]==1 && !visited[x2][y2]){
                        visited[x2][y2] = true;
                        q.add(new dot(x2,y2));
                        map[x2][y2] = map[d.x][d.y]+1;
                    }
                }
            }

        }


    }
}
class dot{
    int x;
    int y;
    public dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}
