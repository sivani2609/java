import java.util.Scanner;
class score{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 35 && score <60)
            System.out.println("I can get a video game");
        else if(score >= 60 && score < 90)
            System.out.println("I can get a Iphone");
        else
            System.out.println("I can get a Macbook pro ");
    }
}