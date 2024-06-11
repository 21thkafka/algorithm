package org.example;

import java.util.Scanner;

public class RevolveString {

    public static void main(String[] args){
        RevolveString T = new RevolveString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }

    public String solution(String str){
        String result = "YES";
        char[] arr = str.toUpperCase().toCharArray();
        int lt = 0, rt = arr.length-1;
        while(lt<rt){
            if(arr[lt]!=arr[rt]){
                result = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return result;
    }

    //해설 강의 코드
    public String solution2 (String str){
        String answer="YES";
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    //StringBuilder 이용하는 방법
    public String anotherSolution (String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }
}
