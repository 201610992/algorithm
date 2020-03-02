package programmers.day03.targetnumber_bfs;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1;
        }
        int target = 3;

        System.out.println(sol.solution(numbers, target));
    }
}

class Solution {

    public int solution(int[] numbers, int target) {
        int ans = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(numbers[0]);
        q.add(-numbers[0]);

        for (int depth = 1; depth < numbers.length; depth++) {
            int size = q.size();
            while (size != 0) {
                int temp = q.poll();
                q.add(temp + numbers[depth]);
                q.add(temp - numbers[depth]);
                size--;
            }
        }

        int size = q.size();
        for (int i = 0; i < size; i++) {
            if (q.poll() == target) {
                ans++;
            }

        }
        return ans;
    }
}