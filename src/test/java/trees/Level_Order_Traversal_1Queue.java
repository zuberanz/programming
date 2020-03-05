package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal_1Queue {

    public static void level_order_traversal_1_stack(Node root){

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){

            root=q.remove();
            if(root==null){
                if(!q.isEmpty()){
                System.out.println();
                q.add(null);
                continue;}
            }else {
                System.out.print(root.key + " ");
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
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
        System.out.println("Level order traversal of  tree using 1 Queue");
        level_order_traversal_1_stack(root);

    }
}
