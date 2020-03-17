package baekjoon.day11.safeArea_2468;


import java.util.*;

/**
 * Created by Sohee on 2020-03-17.
 */
public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int max;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = sc.nextInt();
            }
        }

        max = Max(map);



        int count;

        for(int k=0;k<=max;k++) {
            count=0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i][j] == false && map[i][j]>k) {
                        bfs(new dot(i, j), max,k);
                        count++;
                    }
                }
            }
            arr.add(count);
        }


        System.out.println(Collections.max(arr));




    }
    public static int Max(int[][] map){
        int maxx = map[0][0];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j] > maxx){
                    maxx = map[i][j];
                }
            }
        }
        return maxx;
    }


    public static void bfs(dot d, int max, int k){
        Queue<dot> q = new LinkedList<>();
        visited[d.x][d.y] = true;
        q.add(d);
        while(!q.isEmpty()){
            dot temp = q.poll();
            int x1 = temp.x;
            int y1 = temp.y;
            for(int i=0;i<4;i++){
                int x2 = x1+dx[i];
                int y2 = y1+dy[i];

                if(x2>=0 && y2>=0 && x2<N && y2<N && !visited[x2][y2]){
                    if(map[x2][y2]>k){
                        q.add(new dot(x2,y2));
                        visited[x2][y2] = true;
                    }
                }
            }

        }


    }
}

class dot{
    int x;
    int y;
    public dot(int x,int y){
        this.x=x;
        this.y=y;
    }
}
