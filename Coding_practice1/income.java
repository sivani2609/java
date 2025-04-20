import java.util.Scanner;
class income{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the income:");
        int income = sc.nextInt();
        if(income > 7000)
            System.out.println("scholarship is available");
        else
            System.out.println("not eligible for scholarship");
    }
}