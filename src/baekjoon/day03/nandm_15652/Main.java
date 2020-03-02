package baekjoon.day03.nandm_15652;

import java.util.Scanner;

public class Main {

    public static int N;
    public static int M;
    public static int[] num;
    public static boolean[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        num = new int[M+1];
        arr = new boolean[N+1];

        func(0);
    }

    public static void func(int index){
        if(index==M){
            for(int i=0;i<M;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=1;i<=N;i++){
            if(arr[i]) continue;
            arr[i] = true;
            num[index] = i;
            func(index+1);
            arr[i] = false;
        }



    }
}
