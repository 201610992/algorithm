package baekjoon.day04.findroute_floydwashal_11403;

import java.util.Scanner;

public class Main {
    public static void func(int num, int[][] graph) {
        for(int mid=0;mid<num;mid++){
            for(int start=0;start<num;start++){
                if(graph[start][mid]==0){
                    continue;
                }
                for(int end=0;end<num;end++){
                    if(graph[mid][end]==0){
                        continue;
                    }
                    graph[start][end]=1;
                }
            }
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] graph = new int[num][num];

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                graph[i][j] = sc.nextInt();
            }
        }
        func(num, graph);

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph.length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }

    }
}