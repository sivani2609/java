import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num =scan.nextInt();
        int count=(int)(Math.log(num)+1);
        System.out.println(count);
    }

}