import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=scan.nextInt();
        int [] num=new int[n];
        int sum=0;
        for(int i=0;i<num.length;i++){
            System.out.println("enter the number:");
            num[i]=scan.nextInt();
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}