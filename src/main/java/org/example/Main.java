package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char word = sc.next().charAt(0);
        System.out.println(main.Solution(str, word));
    }

    public int Solution(String str, char word){
        int cnt = 0;
        str=str.toUpperCase();
        word=Character.toUpperCase(word);
        for(char part : str.toCharArray()){     // toCharArray 문자열을 캐릭터 배열로 변환
            if(part==word) cnt++;
        }
        return cnt;
    }
}