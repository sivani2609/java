/*Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true */

public class same_first_last {
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 1};
        int[] arr3 = {1, 2, 1};
        int[] arr4 = {7};
        int[] arr5 = {};

        System.out.println(sameFirstLast(arr1)); 
        System.out.println(sameFirstLast(arr2)); 
        System.out.println(sameFirstLast(arr3)); 
        System.out.println(sameFirstLast(arr4)); 
        System.out.println(sameFirstLast(arr5)); 
    }
}
