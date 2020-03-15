import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {

    public static void main(String[] args) {
        int[] nums = { 2, 11, 15, 7 };
        int[] ints = twoSum(nums, 13);
        for (int i = 0; i < ints.length; i++) {

            System.out.println(ints[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>  map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
// @lc code=end
