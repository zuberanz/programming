package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Complete_Binary_Tree_Given_Array {


    public static Node construct_complete_binary_tree_recur(Node root, int[] arr, int i){
        int len = arr.length;
        if( i >= len){
            return null;
        }

         root = new Node(arr[i]);
        ///root=temp;

        root.left  = construct_complete_binary_tree_recur(root.left,arr, (2*i + 1));
        root.right = construct_complete_binary_tree_recur(root.right,arr,(2*i + 2));

        return root;

    }

    public static Node construct_complete_binary_tree(int[] arr){

        int start = 0;
        int end = arr.length;

        int left = 0;
        int right=0;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(start < end){

            Node parent = q.remove();

            left = (2*start)+1;
            if(left < end){
                parent.left = new Node(arr[left]);
                q.add(parent.left);
            }
            right = (2*start)+2;
            if(right < end){
                parent.right = new Node(arr[right]);
                q.add(parent.right);
            }

            start++;
        }

        return root;
    }

    public static Node construct(int[] arr){
        Node root=new Node(arr[0]);
        int len = arr.length;
        int left=0, right=0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node current=null;
        for(int i=0; i < len ; i++){
            left=(2*i)+1;
            right=(2*i)+2;
            current = q.remove();

            if(left < len){
            current.left = new Node(arr[left]);
            q.add(current.left);}
            if(right < len) {
                current.right = new Node(arr[right]);
                q.add(current.right);
            }
        }

        return root;
    }



    public static void main(String[] args){

        int[] arr =  new int[]{1,2,3,4,5,6,7,8,9,10};
        Node root = null;
        root = construct_complete_binary_tree_recur(root, arr,0);
        tree_learning.In_order_tree_print(root);
        System.out.println();
        root=null;
        root = construct_complete_binary_tree(arr);
        tree_learning.In_order_tree_print(root);
        root=null;
        construct(arr);

    }
}
