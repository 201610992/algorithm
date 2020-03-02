package programmers.day01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.solution(n));
    }
}

class Solution {
    public String solution(int n) {
        String answer = "";
        while (n > 0) {
            if(n % 3 == 0) {
                answer = "4" + answer;
                n = (n - 1) / 3;
            } else {
                answer = n % 3 + answer;
                n /= 3;
            }
        }
        return answer;
    }
}