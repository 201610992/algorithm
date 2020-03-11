package baekjoon.day09.amazingprimenum_2023;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static public int n;
    static public StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        dfs("",0);
        System.out.println(sb.toString());
    }

    public static void dfs(String s,int count){
        if(count==n){
            sb.append(s+'\n');
        }
        for(int i=1;i<=9;i++){
            if(isPrime(Integer.parseInt(s+i))){
                dfs(s+i,count+1);
            }
        }
    }

    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=2;i<=sqrt;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
