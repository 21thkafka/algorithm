package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ShortestDistanceWord {

    public static void main(String[] args){
        ShortestDistanceWord T = new ShortestDistanceWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    //    System.out.println(Arrays.toString(T.solution(str)));
    //    char c = sc.next().charAt(0);
        for(int x : T.solution(str)){
            System.out.print(x+" ");
        }
    }

    public int[] solution(String str){

        String[] arr = str.split(" ");
        char index = arr[1].charAt(0);
        String origin = arr[0];
        int[] answer = new int[origin.length()];
        LinkedList<Integer> indexList= new LinkedList<Integer>();
        for(int i=0;i<origin.length();i++){
            if(arr[0].charAt(i)==index){
                indexList.add(i);
            }
        }

        for(int j=0;j<origin.length();j++){
           int distance = origin.length();
           for(int k=0;k<indexList.size();k++){
               int d = Math.abs(indexList.get(k)-j);
               if(d<distance){
                   answer[j] = d;
                   distance = d;
               }
           }
        }
        return answer;
    }

    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            } else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1;i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
