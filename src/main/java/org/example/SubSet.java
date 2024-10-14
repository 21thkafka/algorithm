package org.example;

public class SubSet {
    static int n;   //집합의 원소 갯수
    static int[] ch;    //부분집합 사용 여부 체크
    public static void main(String[] args){
        SubSet T = new SubSet();
        n=3;
        ch=new int[n+1];
        T.DFS(1);
    }

    public void DFS(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1;i<=n;i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            ch[L]=1;
            DFS(L+1);   //왼쪽
            ch[L]=0;
            DFS(L+1);   //오른쪽
        }
    }
}
