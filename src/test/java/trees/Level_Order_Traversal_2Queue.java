package trees;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_2Queue {


    public static void level_order_traversal_2_stacks(Node root){
        if(root == null ){
            return ;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        //add the root to the que 1
        q1.add(root);

        while(! q1.isEmpty() || !q2.isEmpty()){
            while(!q1.isEmpty()){
                root = q1.poll();
                System.out.print(root.key+" ");
                if(root.left!=null){
                    q2.add(root.left);
                }
                if(root.right!=null){
                    q2.add(root.right);
                }
            }
            System.out.println();
            while(!q2.isEmpty()){
                root = q2.poll();
                System.out.print(root.key+" ");
                if(root.left!=null){
                    q1.add(root.left);
                }
                if(root.right!=null){
                    q1.add(root.right);
                }
            }
            System.out.println();
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
        System.out.println("Level order traversal of  tree using 2 stacks");
        level_order_traversal_2_stacks(root);

    }
}
