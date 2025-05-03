import java.util.Scanner;
class armstrong_ramge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number:");
        int a = sc.nextInt();
        System.out.println("enter the ending number:");
        int b = sc.nextInt();
        System.out.println("armstrong numbers between "+a+" and "+b+" are:");
        for (int i = a; i <= b; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }}
    public static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while(num>0){
            int digit = num %10;
            if(digit > 0){
                sum = sum + (int) Math.pow(digit,3);
            }
            num = num/10;
        }
        return sum == temp;
    }
}