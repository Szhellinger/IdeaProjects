package com.leetcode;

import java.util.*;

/**
 * Created by szhell on 5/22/17.
 */
public class Practice {
    public static void main(String[] args) {
        System.out.println(GetReverseInt(123));
    }

    public static 

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i ++) {
            map.put(list1[i], i);
        }
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < list2.length; i ++) {
            if (map.containsKey(list2[i])) {
                result.put(list2[i], map.get(list2[i]) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (String s : result.keySet()) {
            if (result.get(s) < min) {
                min = result.get(s);
            }
        }
        List<String> list = new ArrayList<>();
        for (String s : result.keySet()) {
            if (result.get(s) == min) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static String GetReverseInt(int num) {
        return RecursiveGet(num, "");
    }

    public static String RecursiveGet (int num, String s) {
        int i = num % 10;
        if (i == 0)
            return s;
        else {
            s += i;
            return RecursiveGet(num / 10, s);
        }

    }

    public String complexNumberMultiply(String a, String b) {
        Map<Integer, Integer> map = new HashMap<>();
        return "";
    }

    public static int[] RandomArray(int n, int range) {
        int[] result = new int[n];
        for (int i = 0; i < n; i ++) {
            result[i] = (int) (Math.random() * range);
        }
        return result;
    }

    public static void QuickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        if (start == end - 1) {
            if (nums[start] > nums[end]) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            return;
        }
        int i = start;
        int j = start + 1;
        int axis = nums[start];
        while (j <= end) {
            if (nums[j] <= axis) {
                i ++;
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            j ++;
        }
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;
        QuickSort(nums, start, i - 1);
        QuickSort(nums, i + 1, end);
    }
}
