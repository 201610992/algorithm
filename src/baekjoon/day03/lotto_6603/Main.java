package baekjoon.day03.lotto_6603;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            int[] arr = new int[num];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            Lotto lotto = new Lotto();
            lotto.play(arr);

        }

    }
}

class Lotto{
    private final static int GERMAN_NUM = 6;
    public void play(int[] arr){
        boolean[] checked = new boolean[arr.length];
        dfs(arr,checked,0,GERMAN_NUM);
        System.out.println();
    }
    private void dfs(int[] arr, boolean[] checked, int index, int count){
        if(count==0){
            print(arr,checked);
        }
        for(int i=index;i<arr.length;i++){
            if(!checked[i]){
                checked[i] = true;
                dfs(arr,checked,i,count-1);
                checked[i] = false;
            }
        }
    }

    private static void print(int[] arr, boolean[] checked){
        for(int i=0;i<arr.length;i++){
            if(checked[i]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
