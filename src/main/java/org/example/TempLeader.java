package org.example;

import java.util.Scanner;

public class TempLeader {
    public static void main(String[] args){
        TempLeader T = new TempLeader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution2(n, arr));
    }

    public int solution(int n, int[][] arr){
        int anwser = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++) if(i!=k && arr[i][j] == arr[k][j]) temp++;
            }
            if(temp>max){
                max = temp;
                anwser = i;
            }
        }
        anwser +=1;
        return anwser;
    }
    public int solution2(int n,  int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1;k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }

            }
            if(cnt>max){
                max = cnt;
                answer = i;

            }
        }
        return answer;
    }
}
