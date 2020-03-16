package baekjoon.day09.stackSequence_1874;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Created by Sohee on 2020-03-16.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
        }

        Solution solution = new Solution();
        solution.solution(array);
    }
}
class Solution{
    public void solution(int[] array){
        Stack<Integer> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        int index = 0;

        for(int num = 1;num<=array.length;num++){
            stack.push(num);
            queue.offer('+');
            while(!stack.isEmpty()){
                if(array[index] == stack.peek()){
                    stack.pop();
                    queue.offer('-');
                    index++;
                }else{
                    break;
                }
            }
        }

        if(index == array.length){
            int size = queue.size();
            for(int i=0;i<size;i++){
                System.out.println(queue.poll());
            }
        }else{
            System.out.println("NO");
        }

    }
}