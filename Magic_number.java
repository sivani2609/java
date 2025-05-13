import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        int digit;
        int sum=0;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        while(sum>9){
            digit=sum%10;
            sum=sum+digit;
            sum=sum/10;
        }
        System.out.println(sum);
        if(sum==1){
            System.out.println("It is a Magic Number");
        }
        else{
            System.out.println("Not a Magic Number");
        }

    }
}