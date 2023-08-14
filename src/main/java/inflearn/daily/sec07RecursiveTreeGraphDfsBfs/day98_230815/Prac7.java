package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day98_230815;

/* 7. 이진트리 순회(넓이우선탐색 : 레벨 탐색) :
 *   - 이진트리 레벨탐색(BFS : Breadth-First Search)
 * */

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Prac7 {

    Node root;

    public static void main(String[] args) {
        Prac7 tree = new Prac7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);  // Q.offer(root);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " 레벨 : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.add(cur.lt);
                if (cur.rt != null) Q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
}