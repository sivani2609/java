import java.util.Scanner;

public class GSTCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        double cgst = price * 9 / 100;
        double sgst = price * 11 / 100;
        double total = price + cgst + sgst;

        System.out.println("CGST: " + cgst);
        System.out.println("SGST: " + sgst);
        System.out.println("Total Price: " + total);

        sc.close();
    }
}
