package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();

        if ( root == null )
        {
            return result;  //return empty list
        }

        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> node = root;

        while ( node != null || stack.size() > 0 )  //repeat until no more nodes
        {
            //find the left most node
            while ( node != null )
            {
               stack.push(node);    //remember where we came from
               node = node.left;    //move left

            }

            node = stack.pop();
            result.add(node.val);
            node = node.right;

        }


       return result;

    }
}
