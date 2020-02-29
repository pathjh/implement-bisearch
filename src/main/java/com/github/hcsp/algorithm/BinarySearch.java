package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }

    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        return binarySearch2(strings, target, start, end);
    }

    public static int binarySearch2(String[] strings, String target, int start, int end) {
        if (strings[start].compareTo(target) > 0 || strings[end].compareTo(target) < 0 || start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (strings[mid].compareTo(target) < 0) {
                start = mid + 1;
            } else if (strings[mid].compareTo(target) > 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return binarySearch2(strings, target, start, end);
    }
}
