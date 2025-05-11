import java.util.Scanner;
public class Power_of_number {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        System.out.println("enter the power value:");
        int p=scan.nextInt();
        int sum= (int)Math.pow(n,p);
        System.out.println("Value is:"+sum);
    }
}
