//package algorithm.day02.functiondevelop;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        //testcase 넣어야함
//        Solution sol = new Solution();
//        System.out.println(sol.solution(progresses,speeds));
//    }
//}
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        String answer = new String();
//        int baepocnt=1;
//        int daycnt=0;
//        int tempcnt=0;
//
//        if(progresses[0]>0){
//            daycnt = (int)Math.ceil((100-progresses[0])/(double)speeds[0]);
//        }
//        for(int i=1;i<progresses.length;i++){
//            tempcnt = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
//
//            if(daycnt<tempcnt){
//                answer += Integer.toString(baepocnt)+",";
//                daycnt = tempcnt;
//                baepocnt=0;
//            }
//            baepocnt++;
//        }
//
//        if(baepocnt>0){
//            answer+=Integer.toString(baepocnt)+",";
//        }
//
//        String[] return_str = answer.split(",");
//        int[] return_int = new int[return_str.length];
//
//        for(int i=0;i<return_int.length;i++){
//            return_int[i] = Integer.parseInt(return_str[i]);
//        }
//
//        return return_int;
//    }
//}