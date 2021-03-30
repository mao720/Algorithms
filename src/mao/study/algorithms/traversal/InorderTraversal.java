package mao.study.algorithms.traversal;

import mao.study.algorithms.utils.TreeNode;
import mao.study.algorithms.utils.TreeUtils;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //1. 递归遍历
        //recursion(root, list);

        //2. 迭代遍历
        Deque<TreeNode> deque = new LinkedList<>();
        while (root != null || !deque.isEmpty()) {
            while (root != null) {
                deque.push(root);
                root = root.left;
            }
            TreeNode cur = deque.pop();
            list.add(cur.val);
            root = cur.right;
        }

        //3. Morris 遍历（空间复杂度为 O(1)）
        return list;
    }

    public static void recursion(TreeNode node, List<Integer> list) {
        if (node == null) return;
        recursion(node.left, list);
        list.add(node.val);
        recursion(node.right, list);
    }

    public static void main(String[] args) {
        System.out.println(inorderTraversal(TreeUtils.buildTree()));
    }
}
