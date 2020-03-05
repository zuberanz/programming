package trees;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_Level_Order_Traversal_Que_Stack {

    public static void Reverse_level_order_traversal_1_stack(Node root){

        if(root == null){
            return;
        }
        Queue<Node> q =  new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);

        while(!q.isEmpty()){
            root = q.poll();
            if(root.left!=null){
                q.add(root.left);
            }
            if(root.right!=null){
                q.add(root.right);
            }
            s.push(root);
        }

        while(!s.isEmpty()){
            System.out.print(s.pop().key+" ");
        }


    }


    public static void main(String[] args) {


        int[] arr = new int[]{10, 5, 15, 2, 8, 13, 19, 6};
        Node root = null;

        System.out.println(" Constructing tree ITERATIVELY");
        for (int n : arr) {
            root = Binary_Search_tree.construct_bst_iterative(root, n);
        }
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);


        //level order traversal using 2 stacks
        System.out.println();
        System.out.println("Reverse (bootom to top) Level order traversal of  tree using 1 stack 1 que");
        Reverse_level_order_traversal_1_stack(root);

    }
}
