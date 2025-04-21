import java.util.Scanner;
class average_mark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        int average = total / 5;
        if(average < 35)
            System.out.println("additional class is required");
        else
            System.out.println("you are good to go");
    }
}