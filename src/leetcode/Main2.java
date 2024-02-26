package leetcode;

public class Main2 {

    /*
        Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

        Return any array that satisfies this condition.

        Example 1:

        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
        Example 2:

        Input: nums = [0]
        Output: [0]
    */

    //https://leetcode.com/problems/sort-array-by-parity/description/

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParity(nums);
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int over = 0;
        int odd = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) result[over++] = num;
            else result[odd--] = num;
        }
        return result;

//        List<Integer> list = new ArrayList<>();
//        list.addAll(Arrays.stream(nums).filter(n -> n % 2 == 0).boxed().toList());
//        list.addAll(Arrays.stream(nums).filter(n -> n % 2 == 1).boxed().toList());
//        return list.stream().mapToInt(value -> value).toArray();
//
//
//        return Arrays.stream(Arrays.stream(nums).boxed().toArray(Integer[]::new))
//                .sorted(Comparator.comparingInt(n -> n % 2 == 0 ? 0 : 1))
//                .mapToInt(x -> x)
//                .toArray();
    }
}