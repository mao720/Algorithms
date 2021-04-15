package mao.study.algorithms.traversal;

public class DynamicProgramming_LC_213 {
    public static int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(robWithArea(nums,0,nums.length-2),robWithArea(nums,1,nums.length-1));
    }

    public static int robWithArea(int[] nums,int start,int end){
        int a = 0;int b = 0;
        int cur;
        for(int i = start;i<=end;i++){
            cur = Math.max(a+nums[i],b);
            a = b;
            b = cur;
        }
        return b;
    }

    public static void main(String[] args) {
//        你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
//        给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
//
//        示例1：
//        输入：nums = [2,3,2]
//        输出：3
//        解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
        System.out.println(rob(new int[]{2, 3, 2}));
    }
}
