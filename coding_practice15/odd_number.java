import java.util.Scanner;
class odd_number{
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number:");
        int a = sc.nextInt();
        System.out.println("enter the ending number");
        int b = sc.nextInt();
        for(int i = a;i < b; i++){
            if(i%2 != 0){
                count = count+1;
            }
        }
        System.out.println("total number of odd numbers are:"+count);

    }

}