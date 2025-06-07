import java.util.Scanner;
class sum_of_last_digit{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number:");
        int first=scan.nextInt();
        System.out.println("enter the second number:");
        int second=scan.nextInt();
        first=first%10;
        second=second%10;
        int sum=first+second;
        System.out.println("Sum of last digit of two given numbers:"+sum);
    }
}