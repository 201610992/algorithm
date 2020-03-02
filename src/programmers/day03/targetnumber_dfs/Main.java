package programmers.day03.targetnumber_dfs;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=1;
        }
        int target = 3;

        System.out.println(sol.solution(numbers,target));
    }
}
class Solution {
    static int ans=0;
    public int solution(int[] numbers, int target) {
        int sum = 0;
        int depth = 0;

        dfs(numbers, target,sum,depth);
        return ans;
    }

    public void dfs(int[] numbers, int target, int sum, int depth){
        if(depth==numbers.length){
            if(sum==target){
                ans++;
            }
            return;
        }
        dfs(numbers,target,sum+numbers[depth],depth+1);
        dfs(numbers,target,sum-numbers[depth],depth+1);

    }
}