package com.hym.algorithm;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int mod = (m+n) % 2;
        int mid = (m+n) / 2;

        int[] temp = new int[mid+1];
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n && count < temp.length) {
            if (nums1[i] < nums2[j]) {
                temp[count++] = nums1[i];
                i++;
            } else {
                temp[count++] = nums2[j];
                j++;
            }
        }

        while (count < temp.length) {
            if (i < m ) {
                temp[count++] = nums1[i];
                i++;
            }

            if (j < n ) {
                temp[count++] = nums2[j];
                j++;
            }
        }

        if (mod == 0 ) {
            return (double)(temp[count-1] + temp[count-2])/2;
        } else {
            return (double)temp[count-1];
        }

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <=1) {return nums.length;}
        int count = 0;
        boolean dupFlag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = count + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dupFlag = true;
                    continue;
                } else if(dupFlag){
                    nums[i+1] = nums[j];
                    count = j;
                    break;
                }
            }
        }

        for(int k = 0; k < nums.length-1; k++) {
            if (nums[k] < nums[k+1]) {
                continue;
            }else {
                return k+1;
            }
        }

        return nums.length;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int[] a = {};
        int[] b = {1,1,2,3};

        System.out.println(s.findMedianSortedArrays(a,b));

        int[] c = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(s.removeDuplicates(b));

    }
}