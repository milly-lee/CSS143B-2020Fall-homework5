package Problem3;

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {

        if ( root == null)  //base case
        {
            return;
        }

        if (valToInsert <= root.val)
        {
            if (root.left == null)
            {
                root.left = new TreeNode<>(valToInsert);
                return;
            }
            insert(root.left,valToInsert);

        }

        if(valToInsert > root.val)
        {
            if ( root.right == null)
            {
                root.right = new TreeNode<>(valToInsert);
                return;
            }
            insert(root.right,valToInsert);
        }
    }
}
