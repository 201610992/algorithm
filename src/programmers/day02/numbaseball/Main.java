package programmers.day02.numbaseball;

public class Main {
    public static void main(String[] args) {
        int[][] baseball = {{123,1,1},{356,1,0},{327,2,0},{489,0,1}};

        Solution sol = new Solution();
        System.out.println(sol.solution(baseball));

    }
}

class Solution {
    public int solution(int[][] baseball) {
        int answer = 0;
        for(int i=123;i<=987;i++){
            int b = (i/10)%10; //가운데숫자
            if(b==0) continue;
            int a = i%10; //제일 마지막 숫자
            if(a==0 || a==b) continue;
            int c = i/100;
            if(b==c || a==c) continue;

            boolean flag = true;

            for(int j=0;j<baseball.length;j++){

                if(!isCorrect(a,b,c,baseball[j][0],baseball[j][1],baseball[j][2])){
                    flag = false;
                    break;
                }
            }

            if(flag) answer++;

        }

        return answer;
    }

    static boolean isCorrect(int a, int b, int c, int q, int strike, int ball){
        int A,B,C,strikeCnt=0,ballCnt=0;
        A = q%10;
        B = q/10%10;
        C = q/100;

        if(a==A) strikeCnt++;
        if(b==B) strikeCnt++;
        if(c==C) strikeCnt++;
        if(a!=A && (a==B || a==C)) ballCnt++;
        if(b!=B && (b==A || b==C)) ballCnt++;
        if(c!=C && (c==A || c==B)) ballCnt++;

        if(strikeCnt==strike && ballCnt==ball) return true;
        return false;

    }
}