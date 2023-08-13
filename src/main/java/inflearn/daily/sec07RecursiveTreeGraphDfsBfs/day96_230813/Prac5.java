package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day96_230813;

/* 5. 이진트리 순회(깊이우선탐색) :
 */

class Node {

    int data;
    Node lt;
    Node rt;

    public Node(int data) {
        this.data = data;
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

        tree.DFS(tree.root);
    }

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
//            System.out.println(root.data);
            DFS(root.lt);
            System.out.print(root.data + " ");
            DFS(root.rt);
//            System.out.println(root.data);
        }

    }
}