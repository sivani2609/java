public class firstlast6 {
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 6};
        int[] test2 = {6, 1, 2, 3};
        int[] test3 = {13, 6, 1, 2, 3};
        int[] test4 = {6};
        int[] test5 = {2};
        System.out.println(firstLast6(test1)); 
        System.out.println(firstLast6(test2)); 
        System.out.println(firstLast6(test3)); 
        System.out.println(firstLast6(test4)); 
        System.out.println(firstLast6(test5)); 
    }
}
