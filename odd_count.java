import java.util.Scanner;
class odd_count{
    public static void main(String[] args){
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers:");
        for(int i =0;i<5;i++){
            int num = sc.nextInt();
            if(num%2 != 0){
                count++;
            }
    }
    System.out.println(count);
        }
    
}
