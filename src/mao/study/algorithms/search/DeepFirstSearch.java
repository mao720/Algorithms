package mao.study.algorithms.search;

public class DeepFirstSearch {
    public static void dfs(int index) {
        //结束条件
        if (index == 3) return;
        //遍历
        for (int i = 0; i < 3; i++) {
            //做选择
            System.out.println("Add:" + i);
            //进入下一层遍历
            dfs(index + 1);
            //撤销选择
            System.out.println("Remove:" + i);
        }
    }

    public static void main(String[] args) {
        //DFS(深度优先搜索、回溯算法)
        dfs(0);
    }
}
