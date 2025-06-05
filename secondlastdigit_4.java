import java.util.Scanner;
class secondlastdigit_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if(n>0){
            int num=n/10;
            int second_last_digit = num%10;
            System.out.println(second_last_digit);
        }
    }
}
