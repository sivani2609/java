import java.util.Scanner;

class prime_no_range {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int num_1 = scan.nextInt();
        System.out.println("Enter the ending number:");
        int num_2 = scan.nextInt();

        System.out.println("Prime numbers between " + num_1 + " and " + num_2 + " are:");

        for(int i=num_1;i<=num_2;i++){
            int count=0;
            if(i<2){
                continue;
            }
            for(int j=1;j<=num_2;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
           
    }
}
