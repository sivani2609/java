import java.util.Scanner;
class number_printing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
            do { 
            System.out.println("enter the number");
            num = sc.nextInt();
            } while (num <10);
            System.out.println("the number is "+num);
    }
    }
