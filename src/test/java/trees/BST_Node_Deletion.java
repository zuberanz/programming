package trees;

public class BST_Node_Deletion {

    public static Node find_min_node(Node min_node){

        while(min_node.left != null){
            min_node=min_node.left;
        }
        return min_node;
    }

    public static Node BST_DeleteNode(Node root, int val){


        //if tree itsef is empty return null
        if(root == null){
            return null;
        }

        //if tree has only one element and same node to be deleted
        if(root.key==val){
            root = null;
            return null;
        }


        //find the node which has to be deleted and also keep the reference of parent
        Node current = root;
        Node parent =  current;
        while(current != null){
            if(current.key ==  val){
                break;
            }
            parent = current;
            if(val < current.key){
                current=current.left;
            }else{
                current=current.right;
            }
        }

        //here we check if the node is not found in the tree we return root node itself
        if(current == null){
            return root;
        }

        //since we found the node to be deleted, there will be 3 cases of deletion as follows

        //Case 1 : here we check if the node to be deleted doesnt have any child (leaf node)
        if(current.left == null && current.right == null){
            // now we need to check if the node to be deleted is the right or left child of its parent node
            if(parent.left == current){
                parent.left=null;
            }else{
                parent.right=null;
            }
        }
        //Case2 : here we check if the node to be deleted has both child (right and left)
        else if(current.right!=null && current.left!=null) {

            //here we find the minimum element on the right subtree of the node to be deleted
            //this will be successor node
            Node min_node = find_min_node(current.right);

            //keep reference of the value of min_node
            int min_val =  min_node.key;

            //now delete the min_value node found above , here the node can have at most 1 child( that too right one)
            BST_DeleteNode(root,min_val);

            // set the min node value to the node to be deleted
            current.key = min_val;

        }else{
            //case 3 : where node to be deleted has one child
            //find if the child node is right or left
            Node child_node = (current.left!=null)?current.left:current.right;

            //find out if the node to be deleted is right or left child of its parent
            if(current == parent.left){
                parent.left=child_node;
            }else{
                parent.right=child_node;
            }

        }

        return root;
    }




    public static void main(String[] args){

        int[] arr = new int[]{10,5,15,2,8,13,19,6,17,20,18};
        Node root = null;


        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
            root = Binary_Search_tree.construct_bst_iterative(root,n);
        }
        System.out.println("Tree before deletion of node");
        tree_learning.pre_order_tree_print(root);

        int n = 15;
        root = BST_DeleteNode(root, n);

        System.out.println("Tree after deletion of node " +n);
        System.out.println("pre-order traversal of the contructed tree ");
        tree_learning.pre_order_tree_print(root);


    }
}
