package inflearn.sec07;

public class Q2Binary {

    public static void main(String[] args){
        Q2Binary T = new Q2Binary();
        T.DFS(11);
    }

    public void DFS(int n){
        if(n==0) return;
        else{
//            System.out.println(n + " ");
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}
