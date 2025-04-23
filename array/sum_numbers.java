import java.util.Scanner;
class sum_numbers{
    public static void main(String[] args) {
        int sum =0;
        int[] score = new int[5];
        for(int i =0;i<5;i++){
            System.out.println("enter the number:");
            Scanner sc = new Scanner(System.in);
            score[i] = sc.nextInt();
            sum = sum+score[i];
        }
        System.out.println("the sum of numbers:"+sum);

    }
}