package mao.study.algorithms.traversal;

public class DynamicProgramming {
    private static final int[] memo = new int[47];

    public static int topDown(int n) {
        if (n < 2) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = topDown(n - 1) + topDown(n - 2);
        return memo[n];
    }

    public static int bottomUp(int n) {
        int a = 1, b = 1;
        int cur;
        for (int i = 2; i <= n; i++) {
            cur = a + b;
            a = b;
            b = cur;
        }
        return b;
    }

    public static void main(String[] args) {
        //动态规划，一种解题思路。

        //实现方式：自顶向下（DFS + memo）
        System.out.println(topDown(45));
        //实现方式：自底向上
        System.out.println(bottomUp(45));
    }
}
