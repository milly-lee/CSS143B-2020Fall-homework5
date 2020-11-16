package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {

        //https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/solution/

        // step 1: compare the distance from root to target
        //collect all nodes based on the distance
        //a. itself
        //b.node in the subtree that does not contain target

        List<Integer> result = new ArrayList<>();
//
//        if ( root == null)    //base case
//        {
//            return result;
//        }
//
//        if ( root == target)
//        {
//            return target;
//        }
//
//        Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
//
//        int distance = 0;
//
//        while (! queue.isEmpty() )
//        {
//            TreeNode node = queue.poll();
//
//            if ( node == null )
//            {
//                if ( distance == k )
//                {
//                    result.add ( node.val );
//                    return result;
//                }
//
//                queue.offer(null );
//                distance ++;
//            }
//
//        TreeNode left = distanceK(root.left, target, k);
//        TreeNode right = distanceK(root.right, target, k);
//
//        // Target in the left subtree
//        if ( left >= 0)
//        {
//            if (left == k - 1)
//            {
//                result.get(root.val);
//            }
//            // get nodes in right subtree with depth K - left - 2
//            return left + 1;
//        }

//        // Target in the right subtree
//        if (right >= 0) {
//            if (right == K - 1)
//                result.get(root.val);
//            // get nodes in left subtree with depth K - right - 2
//            (root.left, K - right - 2);
//            return r + 1;
//        }


//            else
//            {
//                if ( !seen.contains ( node.left ))
//                {
//                    seen.add(node.left);
//                    queue.offer(node.left);
//                }
//                if ( !seen.contains ( node.right ))
//                {
//                    seen.add(node.right);
//                    queue.offer(node.right);
//                }
//                TreeNode par = parent.get(node);
//                if (!seen.contains(par))
//                {
//                    seen.add(par);
//                    queue.offer(par);
//                }
//            }
//            return new ArrayList<Integer>();
//        }

        return result;  // place holder
    }
}