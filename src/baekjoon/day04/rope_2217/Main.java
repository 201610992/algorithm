package baekjoon.day04.rope_2217;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int[] result = new int[num];
        int m=0;
        for(int j=num;j>0;j--){
            result[m]=arr[m]*j;
            m++;
        }

        int max = result[0];
        for(int k=0;k<result.length;k++){
            if(max<result[k]){
                max = result[k];
            }
        }

        System.out.println(max);

    }
}
