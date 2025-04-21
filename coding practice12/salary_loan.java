import java.util.Scanner;
class salary_loan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary:");
        int salary = sc.nextInt();
        System.out.println("enter the age:");
        int age = sc.nextInt();
        if(salary >=20000 || age <=25)
        {
            System.out.println("enter the loan amount:");
            int amount = sc.nextInt();
            if(amount <= 50000){
                System.out.println("You are eligible for loan");
            }
            else{
                System.out.println("You are not eligible for loan");
            }}

        else
            System.out.println("you are not eligible for loan");
        }
    }
