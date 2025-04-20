import java.util.Scanner;
class mark{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark:");
        int mark = sc.nextInt();
        if(mark > 35)
            System.out.println("pass");
        else
            System.out.println("fail");

    }
}