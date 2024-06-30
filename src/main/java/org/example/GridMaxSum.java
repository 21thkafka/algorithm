package org.example;

import java.util.Scanner;

public class GridMaxSum {
    public static void main(String[] args){
        GridMaxSum T = new GridMaxSum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr){
        int anwser = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
            if(anwser<sum) anwser=sum;
        }

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[j][i];
            }
            if(anwser<sum) anwser=sum;
        }

        int sum1 = 0;
        for(int i=0;i<n;i++) {
            sum1 +=arr[i][i];
            if(i==(n-1) && anwser<sum1) anwser = sum1;

        }
        int i = arr.length;
        int sum2 = 0;
        while(i>0){
            i--;
            sum2 += arr[i][i];
            if(i==0 && anwser<sum2) anwser = sum2;
        }

        return anwser;
    }
    public int solution2(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

}
