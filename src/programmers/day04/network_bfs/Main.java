package programmers.day04.network_bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        Solution sol = new Solution();
        System.out.println(sol.solution(n, computers));
    }
}

class Solution {
    public int solution(int n, int[][] computers) {
        List<Integer>[] lists = new LinkedList[n];

        for (int i = 0; i < n; i++) {
            lists[i] = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                if (computers[i][j] == 1) {
                    lists[i].add(j);
                }
            }
        }
        boolean[] visited = new boolean[n];
        return bfs(visited, lists);
    }

    public int bfs(boolean[] visited, List<Integer>[] lists) {
        int count = 0;
        for (int index = 0; index < lists.length; index++) {
            if (visited[index]) {
                continue;
            }
            Queue<List> queue = new LinkedList<>();
            queue.add(lists[index]);
            while (!queue.isEmpty()) {
                List temp = queue.poll();
                for (Object o : temp) {
                    if (!visited[(int) o]) {
                        queue.add(lists[(int) o]);
                        visited[(int) o] = true;
                    }
                }
            }
            count++;
        }
        return count;
    }

}