package org.example;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        RockPaperScissors T = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arrA = new int[cnt];
        int[] arrB = new int[cnt];
        for(int i=0; i<cnt; i++){
            arrA[i]=sc.nextInt();
        }
        for(int j=0; j<cnt; j++){
            arrB[j]=sc.nextInt();
        }
        String[] answer = T.solution(arrA, arrB, cnt);
        for(int k=0; k<cnt; k++){
            System.out.println(answer[k]);
        }

    }

    public String[] solution(int[] arrA, int[] arrB, int cnt){
        String[] anwser = new String[cnt];
        for(int i=0;i<cnt;i++){
            String result="B";
            if((arrA[i]==1 && arrB[i]==3) || (arrA[i]==2 && arrB[i]==1) || (arrA[i]==3 && arrB[i]==2)){
                result = "A";
            } else if(arrA[i]==arrB[i]){
                result = "D";
            }
            anwser[i] = result;
        }
        return anwser;
    }

    public String solution2(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n;i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }
        return answer;
    }

}
