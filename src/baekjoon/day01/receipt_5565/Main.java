package baekjoon.day01.receipt_5565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int temp=0;
        int[] price = new int[9];
        for(int i=0;i<9;i++ ){
            price[i] = sc.nextInt();
            temp += price[i];
        }
        int result = total-temp;
        System.out.println(result);
    }

}
