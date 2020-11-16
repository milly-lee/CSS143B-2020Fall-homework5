package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {

        List<Integer> result = new ArrayList<>();

//        if ( root == null || k < 0 )    //base case
//        {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList();
//        queue.add(null);
//        queue.add(target);
//
//        parent = new HashMap();
//        Set<TreeNode> seen = new HashSet();
//        seen.add(target);
//        seen.add(null);
//
//        int distance = 0;
//
//        while (! queue.isEmpty() )
//        {
//            TreeNode node = queue.poll();
//            if ( node == null )
//            {
//                if ( distance == k )
//                {
//                        result.add ( node.val );
//                        return result;
//                }
//
//                queue.offer(null );
//                distance ++;
//            }
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
//
//
//
//        public void dfs(TreeNode node, TreeNode par) {
//            if (node != null) {
//                parent.put(node, par);
//                dfs(node.left, node);
//                dfs(node.right, node);
//            }
//        }
//    }
        return result;
    }
}
