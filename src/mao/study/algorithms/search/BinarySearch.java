package mao.study.algorithms.search;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class BinarySearch {
    public static int indexOf(int key, int[] arr) {
        //二分查找
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) high = mid - 1;
            else if (key > arr[mid]) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int indexOfFirst(int key, int[] arr) {
        //二分查找左边界（大于等于 key 的最小 index）
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key <= arr[mid]) high = mid - 1;
            else if (key > arr[mid]) low = mid + 1;
        }
        //添加此行可以精准查找
        //if (low >= arr.length || arr[low] != key) return -1;
        return low;
    }

    public static int indexOfLast(int key, int[] arr) {
        //二分查找右边界（小于等于 key 的最大 index）
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) high = mid - 1;
            else if (key >= arr[mid]) low = mid + 1;
        }
        //添加此行可以精准查找
        //if (high < 0 || arr[high] != key) return -1;
        return high;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        while (scanner.hasNext()) {
            int key = scanner.nextInt();
            System.out.println(indexOf(key, arr));
            System.out.println(indexOfFirst(key, arr));
            System.out.println(indexOfLast(key, arr));
        }
    }
}
