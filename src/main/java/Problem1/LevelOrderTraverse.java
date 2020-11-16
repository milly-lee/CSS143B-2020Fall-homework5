package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();

        if ( root == null  )    //special case, list is empty
        {
            return result;
        }

        Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
        Queue<Integer> levels = new LinkedList<Integer>();

        TreeNode<Integer> node = root;

        queue.add(root);
        levels.add(0);

        while ( !queue.isEmpty() )
        {
            int level = levels.poll();
            TreeNode<Integer> temp = queue.poll();

            if(result.size() <= level)
            {
                result.add(new ArrayList<>());  //if we need another list, add it
            }

            result.get(level).add(temp.val);


            if ( temp.left != null )
            {
                queue.add(temp.left);
                levels.add(level + 1);
            }

            if (temp.right != null)
            {
                queue.add(temp.right);
                levels.add(level +1);
            }

        }

        return result;  // place holder
    }
}
