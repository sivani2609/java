import java.util.Scanner;
class equilibrium_index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total_sum=0;
        for(int i=0;i<n;i++){
            total_sum=total_sum+arr[i];
        }
        int leftsum=0;
        int equilibrium_index=-1;
        for(int i=0;i<n;i++){
            int rightsum=total_sum-leftsum-arr[i];
            if(leftsum == rightsum){
                equilibrium_index=i;
                break;
            }
            leftsum=leftsum+arr[i];
        }
        if(equilibrium_index!=-1){
            System.out.println("equilibrium index "+equilibrium_index);
        }else{
            System.out.println("equilibrium index not found in array");
        }
    }
}
