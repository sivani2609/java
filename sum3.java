public class Sum3 {
    
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
    public static void main(String[] args) {
        Sum3 obj = new Sum3();
        System.out.println(obj.sum3(new int[]{1, 2, 3}));   
        System.out.println(obj.sum3(new int[]{5, 11, 2}));  
        System.out.println(obj.sum3(new int[]{7, 0, 0}));   
    }
}
