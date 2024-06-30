package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GetRank {
    public static void main(String[] args){
        GetRank T = new GetRank();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        //ArrayList<Integer> answer = T.solution(n, input);
        int[] answer = T.solution2(n, input);
        for(int x: answer){
            System.out.print(x + " ");;
        }

    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0) answer.add(1);
            else{
                for(int j=0;j<i;j++){
                    if(answer.get(i)>answer.get(j)){
                        answer.set(i, answer.get(j)-1);
                        answer.set(j, answer.get(i)+1);
                    } else if(answer.get(i)<answer.get(j)) {
                        answer.set(i, answer.get(j)+1);
                    }

                }
            }
        }
        return answer;
    }
    public int[] solution2(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        return answer;
    }
}
