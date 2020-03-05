package trees;

import java.util.ArrayList;
import java.util.List;

public class Is_Given_Tree_Binary_Tree {

    public static boolean is_it_a_BST_recur(Node node,int min_val, int max_val){

        //base case
        if(node == null){
            return true;
        }

        // if node's value fall outside valid range
        if(node.key < min_val || node.key > max_val){
            return false;
        }

        // recursively check left and right subtrees with updated range
        return is_it_a_BST_recur(node.left, min_val, node.key) &&
                is_it_a_BST_recur(node.right,node.key,max_val);



    }

    public static void flatten_to_list(Node node, List<Integer> list){

        if(node == null){
            return ;
        }

        flatten_to_list(node.left,list);
        list.add(node.key);
        flatten_to_list(node.right,list);

    }

    public static boolean is_it_a_BST_inOrder(Node root){

        List<Integer> inorder_List = new ArrayList<>();
        flatten_to_list(root,inorder_List );


        for(int i=0 ; i < inorder_List.size()-1 ; i++){
            if(inorder_List.get(i+1) < inorder_List.get(i)){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args){

        int[] arr = new int[]{10,5,15,2,8,13,19,6};
        Node root = null;

        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
            root = Binary_Search_tree.construct_bst_iterative(root,n);
        }
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);
        System.out.println();
        System.out.println(is_it_a_BST_recur(root, Integer.MIN_VALUE,Integer.MAX_VALUE));

        System.out.println("after swappin nodes to test is BST");

       /* Node left = root.left;
        root.left = root.right;
        root.right = left;*/


        tree_learning.pre_order_tree_print(root);
        System.out.println();
        System.out.println("using Recursion Integer.MIN_VALUE , Integer.MAX_VALUE ");
        System.out.println(is_it_a_BST_recur(root, Integer.MIN_VALUE,Integer.MAX_VALUE));


        System.out.println("using inorder traversal");
        System.out.println(is_it_a_BST_inOrder(root));
        System.out.println();


    }
}
