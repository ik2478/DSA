package com.demo.dsa;

public class BinarySearch {
    public int binarySearch(int[] values,int target){

        int right = values.length - 1;
        int left = 0;

        while(left <= right){

            int mid = (left +  right) / 2;
            System.out.println("mid in DSA is: " + mid);
            if(values[mid] == target){
                return mid;
            }
            else if(values[mid] < target){
                left = mid + 1;
            }
            else
                right = mid -1;
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println("helll");
        BinarySearch binarySearch = new BinarySearch();
        int mid = binarySearch.binarySearch(new int[]{2, 3, 4, 10, 40},10);
        System.out.println("mid is: " + mid);
    }
}
