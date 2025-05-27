package com.demo.dsa;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            return new int[]{map.get(target - nums[i]), i};
        }
        map.put(nums[i], i);

    }
//    int left = 0, right = nums.length - 1;
//    while (left < right) {
//        int sum = nums[left] + nums[right];
//        if (sum == target) {
//            return new int[]{left, right};
//        }
//        if (sum < target) {
//            left++;
//
//        }
//        if (sum > target) {
//            right--;
//        }
//
//    }
//
    return new int[]{-1, -1};
}
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[]returnTwoSum = twoSum.twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(returnTwoSum));

    }
}
