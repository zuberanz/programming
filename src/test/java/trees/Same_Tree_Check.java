package trees;

public class Same_Tree_Check {


    public static boolean is_sameTree(Node root1, Node root2){

        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }

       return root1.key == root2.key &&
               is_sameTree(root1.left,root2.left) &&
               is_sameTree(root1.right, root2.right);

    }



    public static void main(String[] args){
        int[] arr = new int[]{10,5,15,2,8,13,19,6};
        int[] arr1 = new int[]{10,5,15,2,8,13,19,6};
        Node root1 = null;
        Node root2 = null;

        System.out.println(" Constructing tree ITERATIVELY");
        for(int n : arr) {
            root1 = Binary_Search_tree.construct_bst_iterative(root1,n);
        }
        for(int n : arr1) {
            root2 = Binary_Search_tree.construct_bst_iterative(root2,n);
        }


        System.out.println(is_sameTree(root1,root2));


    }
}
