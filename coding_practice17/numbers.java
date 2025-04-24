import java.util.Scanner;
class numbers{
    public static void main(String[] args) {
        int[] number = new int[5];
        for(int i =0;i<5;i++){
            System.out.println("enter the number:");
            Scanner sc = new Scanner(System.in);
            number[i] = sc.nextInt();
            
        }
        for(int i =0;i<5;i++){
            System.out.println("the numbers are:"+number[i]);

    }
}}