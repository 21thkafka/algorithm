package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
    public static void main(String[] args){
        MusicVideo T = new MusicVideo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(T.solution2(n, m, arr));
    }
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum = 0;
        for(int i=0;i<n;i++) sum+=arr[i];
        int avg = sum/m;
        for(int i=n-1;i>0;i--){
            answer += arr[i];
            if(answer>avg) break;
        }
        return answer;
    }
    public int solution2(int n, int m, int[] arr){
        int answer=0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid)<=m){
                answer=mid;
                rt=mid-1;
            } else lt=mid+1;
        }
        return answer;
    }
    public int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            } else sum+=x;
        }
        return cnt;
    }
}
