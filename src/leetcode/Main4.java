package leetcode;

import java.util.Arrays;

public class Main4 {

    /*
    Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

    Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

    Example 1:

    Input: arr = [1,0,2,3,0,4,5,0]
    Output: [1,0,0,2,3,0,0,4]
    Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
    Example 2:

    Input: arr = [1,2,3]
    Output: [1,2,3]
    Explanation: After calling your function, the input array is modified to: [1,2,3]

    URL: https://leetcode.com/problems/duplicate-zeros/description/
     */

    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
//        int[] arr = {0,0,0,0,0,0,0};
        int[] arr = {1, 2, 3};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();//for copy arr

        int ind = 0;
        for(int i=0; ind<n; i++){
            arr[ind++] = temp[i];
            if(temp[i] == 0 && ind != n) arr[ind++] = 0;
        }
    }
}