package baekjoon.day05.juckrock_dfs_10026;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static char map[][];
    static boolean visited[][];
    static int dx[]={0,0,-1,1};
    static int dy[]={-1,1,0,0};
    static int count=0;
    static int count2=0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for(int i=0;i<n;i++){
            String[] str = br.readLine().split("");
            for(int j=0;j<n;j++){
                map[i][j] = str[j].charAt(0);
            }
        }
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false){
                    count++;
                    dfs(i,j);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]=='R'){
                    map[i][j] = 'G';
                }
            }
        }

        visited = new boolean[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]==false){
                    count2++;
                    dfs(i,j);
                }
            }
        }
        System.out.println(count+" "+count2);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        char c = map[x][y];

        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && !visited[nx][ny]){
                if(c == map[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }

    }


}
