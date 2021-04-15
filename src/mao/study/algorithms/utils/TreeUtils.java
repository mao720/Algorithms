package mao.study.algorithms.utils;

public class TreeUtils {

    /**
     *      1
     *     / \
     *   2     5
     *  / \   / \
     * 3  4  6  7
     */
    public static TreeNode buildTree() {
        return new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, new TreeNode(6), new TreeNode(7)));
    }

    /**
     *     3
     *    / \
     *   2   3
     *    \   \
     *     3   1
     */
    public static TreeNode buildTree2() {
        return new TreeNode(3,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(3, null, new TreeNode(1)));
    }

    /**
     *      7
     *     / \
     *   3    12
     *  / \   / \
     * 0  5  9  16
     */
    public static TreeNode buildSearchTree() {
        return new TreeNode(7,
                new TreeNode(3, new TreeNode(0), new TreeNode(5)),
                new TreeNode(12, new TreeNode(9), new TreeNode(16)));
    }
}
