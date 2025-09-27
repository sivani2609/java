import java.util.Scanner;
class pain_sum_indices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target:");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j]) == target){
                    System.out.println("("+i+","+j+")");
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("no pairs found");
        }
    }
}
