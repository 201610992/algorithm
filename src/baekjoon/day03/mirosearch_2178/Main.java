package baekjoon.day03.mirosearch_2178;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int n,m;
    public static int map[][];
    public static boolean visit[][];
    //오른쪽 아래 왼쪽 위
    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};

    public static void bfs(int x, int y){
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        int count=0;

        qx.add(x);
        qy.add(y);

        while(!qx.isEmpty() && !qy.isEmpty()){
            x = qx.poll();
            y = qy.poll();

            for(int k=0;k<4;k++){
                int x2 = x+dx[k];
                int y2 = y+dy[k];

                if(x2>=0 && y2>=0 && x2<n && y2<m){
                    if(map[x2][y2]==1 && !visit[x2][y2]){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2] = true;
                        map[x2][y2] = map[x][y]+1;
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[100][100];
        visit = new boolean[100][100];

        for(int i=0;i<n;i++){
            String temp = sc.next();
            for(int j=0;j<m;j++){
                map[i][j] = temp.charAt(j)-48;
            }
        }

        bfs(0,0);
        System.out.print(map[n-1][m-1]);

    }
}
