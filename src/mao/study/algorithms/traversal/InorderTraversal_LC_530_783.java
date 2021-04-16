package mao.study.algorithms.traversal;

import mao.study.algorithms.utils.TreeNode;
import mao.study.algorithms.utils.TreeUtils;

public class InorderTraversal_LC_530_783 {
    private static int ans = Integer.MAX_VALUE;
    private static int pre = -1;

    public static int minDiffInBST(TreeNode root) {
        recursion(root);
        return ans;
    }

    public static void recursion(TreeNode node) {
        if (node == null) return;
        recursion(node.left);
        int cur = node.val;
        if (pre != -1) {
            ans = Math.min(ans, cur - pre);
        }
        pre = cur;
        recursion(node.right);
    }

    public static void main(String[] args) {
//        530. 二叉搜索树的最小绝对差
//        Easy
//        783. 二叉搜索树节点最小距离
//        Easy
//        给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
//
//        示例：
//        输入：
//        1
//         \
//          3
//         /
//        2
//        输出：
//        1
//
//        解释：
//        最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
        System.out.println(minDiffInBST(TreeUtils.buildSearchTree()));
    }
}
