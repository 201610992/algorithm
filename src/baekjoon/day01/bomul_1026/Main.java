package baekjoon.day01.bomul_1026;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];
        for(int i=0;i<num;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0;i<num;i++){
            sum += A[i]*B[num-1-i];
        }
        System.out.println(sum);


    }
}
