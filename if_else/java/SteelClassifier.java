import java.util.Scanner;
public class SteelClassifier {
    public static char classifySteel(int h, float c, int ts) {
        if (h > 60 && c > 0.8 && ts > 5700) {
            return 'A';
        } else if (h > 60 && c > 0.8) {
            return 'B';
        } else if (h > 60 && ts > 5700) {
            return 'C';
        } else if (c > 0.8 && ts > 5700) {
            return 'D';
        } else if (h > 60 || c > 0.8 || ts > 5700) {
            return 'E';
        } else {
            return 'F';
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hardness (h): ");
        int h = sc.nextInt();
        System.out.print("Enter Carbon Content (c): ");
        float c = sc.nextFloat();
        System.out.print("Enter Tensile Strength (ts): ");
        int ts = sc.nextInt();
        char steelClass = classifySteel(h, c, ts);
        System.out.println("Steel Class: " + steelClass);
        sc.close();
    }
}