package mao.study.algorithms.traversal;

import mao.study.algorithms.utils.TreeNode;
import mao.study.algorithms.utils.TreeUtils;

public class DynamicProgramming_LC_337 {
    public static int rob(TreeNode root) {
        if (root == null) return 0;
        int[] arr = robI(root);
        return Math.max(arr[0], arr[1]);
    }

    public static int[] robI(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = robI(node.left);
        int[] right = robI(node.right);
        int a = node.val + left[1] + right[1];
        int b = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{a, b};
    }

    public static void main(String[] args) {
//        在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
//        计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
//
//        示例 1:
//        输入: [3,2,3,null,3,null,1]
//           3
//          / \
//         2   3
//          \   \
//           3   1
//        输出: 7
//        解释:小偷一晚能够盗取的最高金额 = 3 + 3 + 1 = 7.

        System.out.println(rob(TreeUtils.buildTree2()));
    }
}
