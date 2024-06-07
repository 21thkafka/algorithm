package org.example;

import java.util.Scanner;

public class ReversWord {
    public static void main(String[] args) {
        ReversWord word = new ReversWord();
        Scanner sc = new Scanner(System.in);
        String cnt = sc.nextLine();
        int n = Integer.parseInt(cnt);
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        word.solution(arr,n);
        for(String s : arr){
            System.out.println(s);
        }

    }

    public void solution(String[] arr, int n){

        for(int i=0; i<n; i++){
            char[] chars = arr[i].toCharArray();
            int round = (int)Math.ceil(arr[i].length()/2);
            for(int j=0; j<round;j++){
                char temp = chars[j];
                int index = arr[i].length() - j - 1;
                chars[j] = chars[index];
                chars[index] = temp;
            }
            arr[i]= String.valueOf(chars);
        }
    }
}
