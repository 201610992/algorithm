package baekjoon.day02.dfsandbfs_1260;

import java.util.*;

public class Main {
    static int[][] graph;
    static boolean visited[];
    static int N;
    static int E;
    static int startPoint;

    public static void dfs(LinkedList<Integer>[] linkedLists, int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        System.out.print(node + " ");
        for (int i = 0; i < linkedLists[node].size(); i++) {
            if (!visited[linkedLists[node].get(i)]) {
                dfs(linkedLists, linkedLists[node].get(i));
            }
        }
    }

    public static void bfs(LinkedList<Integer>[] linkedLists, int node) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(node);
        while (!q.isEmpty()) {
            int nextNode = q.poll();
            if (!visited[nextNode]) {
                visited[nextNode] = true;
                System.out.print(nextNode + " ");
                for (int i = 0; i < linkedLists[nextNode].size(); i++) {
                    q.offer(linkedLists[nextNode].get(i));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[1001][1001];
        E = sc.nextInt();
        visited = new boolean[10001];
        startPoint = sc.nextInt();
        int a, b;

        LinkedList<Integer>[] linkedLists = new LinkedList[N + 1];

        for (int i = 1; i < N + 1; i++) {
            linkedLists[i] = new LinkedList<>();
        }

        for (int i = 1; i <= E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            linkedLists[a].add(b);
            linkedLists[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(linkedLists[i]);
        }

        dfs(linkedLists, startPoint);

        for (int j = 1; j <= N; j++) {
            visited[j] = false;
        }
        System.out.println();
        bfs(linkedLists, startPoint);

    }
}
