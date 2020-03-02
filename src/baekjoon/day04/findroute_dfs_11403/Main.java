package baekjoon.day04.findroute_dfs_11403;

import java.util.Scanner;

public class Main {
    static int num;
    static boolean[] visited;
    static int[][] result;
    static int[][] graph;

    public static void dfs(int x, int y){
        visited[y] = true;
        result[x][y] = 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        graph = new int[num][num]; //그래프 인접 행렬
        result = new int[num][num]; //출력할 배열
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                graph[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                visited[j] = false;
            }
            for(int j=0;j<num;j++){
                if(graph[i][j]==1 && visited[j]==false){
                    dfs(i,j);
                }
            }


        }
    }
}
