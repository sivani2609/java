import java.util.Scanner;
class number_15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting number:");
        int a = sc.nextInt();
        System.out.println("enter the ending number");
        int b = sc.nextInt();
        for(int i = a;i < b; i++){
            if(i%3 == 0 & i%5 ==0){
                System.out.println(i);
            }
        }
        

    }

}