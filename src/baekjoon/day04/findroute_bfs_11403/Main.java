package baekjoon.day04.findroute_bfs_11403;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int num;
    static boolean[] visited;
    static int[][] result;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        graph = new int[num][num];
        result = new int[num][num];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                graph[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<num;i++){
            visited = new boolean[num];
            bfs(i);
        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i=0;i<num;i++) {
                if (graph[temp][i]==1 && visited[i]==false){
                    q.add(i);
                    visited[i] = true;

                    result[start][i] = 1;
                }
            }
        }

    }
}
