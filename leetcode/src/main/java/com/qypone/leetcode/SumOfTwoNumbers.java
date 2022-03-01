package com.qypone.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers {

  public static void main(String[] args) {
    int[] nums = {3, 2, 3};
    int[] ints = new Solution().twoSum(nums, 6);
  }

  static class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > target) {
          continue;
        }
        result[0] = i;
        for (int j = 0; j < nums.length; j++) {
          if (nums[j] > target || i == j) {
            continue;
          }
          result[1] = j;
          if (nums[i] + nums[j] == target) {
            return result;
          }
        }
      }
      return result;
    }
  }

  /**
   * 复杂度为 O(n)
   */
  class Solution2 {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; ++i) {
        if (hashtable.containsKey(target - nums[i])) {
          return new int[]{hashtable.get(target - nums[i]), i};
        }
        hashtable.put(nums[i], i);
      }
      return new int[0];
    }
  }

}
