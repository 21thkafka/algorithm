package org.example;

import java.util.Scanner;

public class AnyCharRevers {
    public static void main(String[] args){
        AnyCharRevers T = new AnyCharRevers();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }

    public String solution (String input){
        char[] arr = input.toCharArray();
        int lt = 0, rt = arr.length-1;
        while(lt<rt){
            if((65 <= arr[lt] && arr[lt] <= 90) || (97 <= arr[lt] && arr[lt] <= 122)){
                if((65 <= arr[rt] && arr[rt] <= 90) || (97 <= arr[rt] && arr[rt] <= 122)) {
                    char tmp = arr[lt];
                    arr[lt] = arr[rt];
                    arr[rt] = tmp;
                }
            }
            lt++;
            rt--;
        }
        return String.valueOf(arr);
    }
}
