package baekjoon.day02.coin_11047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = sc.nextInt();
        int count = 0;
        int[] A = new int[num];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        while(total!=0){
            for(int i = num-1;i>=0;i--){
                if(total-A[i]>=0){
                    count++;
                    total-=A[i];
                    break;
                }
            }

        }
        System.out.println(count);

    }
}
