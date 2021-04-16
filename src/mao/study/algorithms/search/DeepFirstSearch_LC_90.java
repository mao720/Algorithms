package mao.study.algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepFirstSearch_LC_90 {
    static List<Integer> t = new ArrayList<>();
    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;
    }

    public static void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            System.out.println("ADD:" + t);
            return;
        }
        dfs(false, cur + 1, nums);
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) {
            System.out.println("GoBack:" + t);
            return;
        }
        t.add(nums[cur]);
        System.out.println(t);
        dfs(true, cur + 1, nums);
        t.remove(t.size() - 1);
        System.out.println(t);
    }

    public static void main(String[] args) {
//        90. 子集 II
//        Medium
//        给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
//        解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
//
//        示例 1：
//        输入：nums = [1,2,2]
//        输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
//
//        示例 2：
//        输入：nums = [0]
//        输出：[[],[0]]
        List<List<Integer>> list = subsetsWithDup(new int[]{1, 1, 2});
        System.out.println(list);
    }
}
