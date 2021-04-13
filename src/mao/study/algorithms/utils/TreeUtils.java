package mao.study.algorithms.utils;

public class TreeUtils {
    public static TreeNode buildTree() {
        return new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, new TreeNode(6), new TreeNode(7)));
    }

    public static TreeNode buildSearchTree() {
        return new TreeNode(7,
                new TreeNode(3, new TreeNode(0), new TreeNode(5)),
                new TreeNode(12, new TreeNode(9), new TreeNode(16)));
    }
}
