package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day95_230812;

/* 5. 이진트리 순회(깊이우선탐색) :
 */

class Node {
    int data;
    Node lt;
    Node rt;

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class Prac5 {

    Node root;

    public static void main(String[] args) {
        Prac5 tree = new Prac5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        // 말단 노드의 lr, rt는 null.
        tree.DFS(tree.root);
    }

    public void DFS(Node root) {
        if (root == null)  // 말단 노드?
            return;
        else {
//            System.out.print(root.data + " ");  // 전위순회
            DFS(root.lt);
            System.out.print(root.data + " ");   // 중위순회
            DFS(root.rt);
//            System.out.print(root.data + " ");   // 후위순회
        }
    }
}