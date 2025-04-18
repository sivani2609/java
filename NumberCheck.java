import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the integer input
        scanner.close();

        if (n % 2 == 1) { // Check if n is odd
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) { // Even and in range 2 to 5
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) { // Even and in range 6 to 20
            System.out.println("Weird");
        } else { // Even and greater than 20
            System.out.println("Not Weird");
        }
    }
}
