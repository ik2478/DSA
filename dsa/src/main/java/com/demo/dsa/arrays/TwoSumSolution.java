package com.demo.dsa.arrays;

import java.util.Arrays;
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//Your solution must use only constant extra space.

public class TwoSumSolution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;

        for(int i =0;i <numbers.length; i++){
            int value = numbers[left] + numbers[right];
            if(value == target){
                return new int[]{left+1,right+1};
            }
            if(value > target){
                right--;
            }
            if(value < target){
                left++;
            }

        }
        return new int[]{-1,-1};


    }

    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] result = twoSumSolution.twoSum(new int[]{2,7,11,15}, 26);
        System.out.println(Arrays.toString(result));

    }
}
