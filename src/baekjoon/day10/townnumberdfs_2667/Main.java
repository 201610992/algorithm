package baekjoon.day10.townnumberdfs_2667;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int danzi_count=0;
    static int villege_count=0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0;i<n;i++){
            String[] str = br.readLine().split("");
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && map[i][j]==1){
                    villege_count = 1;
                    dfs(new dot(i,j));
                    danzi_count++;
                    arr.add(villege_count);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(danzi_count);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }


    }
    public static int dfs(dot d){
        visited[d.x][d.y] = true;
        for(int i=0;i<4;i++){
            int x2 = d.x+dx[i];
            int y2 = d.y+dy[i];

            if(x2>=0 && y2>=0 && x2<n && y2<n &&
                map[x2][y2]==1 && !visited[x2][y2]){
                dfs(new dot(x2,y2));
                villege_count++;
            }
        }

        return villege_count;



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