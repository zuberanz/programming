package trees;

public class Maximum_Minimum_in_BST {


    public static Node  minimum_Element_BST_iterative(Node root){
        Node current=root;
        if(root == null){
            return null;
        }

        while(root != null){
            current=root;
            root=root.left;
        }

        System.out.println("Minimum Element in the tree : "+current.key);
        return current;

    }


    public static Node minimum_Element_BST_recursive(Node root){

        if(root == null){
            return null;
        }

        if(root.left == null){
            System.out.println("Minimum Element in the tree recursive: "+root.key);
            return root;
        }else{
            return minimum_Element_BST_recursive(root.left);
        }

    }


    public static Node  maximum_Element_BST_iterative(Node root){
        Node current=root;
        if(root == null){
            return null;
        }

        while(root != null){
            current=root;
            root=root.right;
        }

        System.out.println("Maximum Element in the tree : "+current.key);
        return current;

    }


    public static Node maximum_Element_BST_recursive(Node root){

        if(root == null){
            return null;
        }

        if(root.right == null){
            System.out.println("Maximum Element in the tree recursive: "+root.key);
            return root;
        }else{
            return maximum_Element_BST_recursive(root.right);
        }

    }

    public static void main(String[] args){

        int[] arr = new int[]{10,5,15,2,8,13,19,6};
        Node root = null;

        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
            root = Binary_Search_tree.construct_bst_iterative(root,n);
        }

        minimum_Element_BST_iterative(root);
        minimum_Element_BST_recursive(root);
        maximum_Element_BST_iterative(root);
        maximum_Element_BST_recursive(root);
    }

}
