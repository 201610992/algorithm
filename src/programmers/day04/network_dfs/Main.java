package programmers.day04.network_dfs;

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
        int answer = 0;
        boolean[] check = new boolean[n];

        for(int i=0;i<n;i++){
            if(!check[i]){
                dfs(n,computers,i,check);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int n, int[][] computers, int start, boolean[] check){
        check[start] = true;
        for(int i=0;i<computers.length;i++){
            if(computers[start][i]==1 && check[i]==false){
                dfs(n,computers,i,check);
            }
        }

    }

}