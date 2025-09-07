import java.util.Scanner;
class count_even_odd_elements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] odd=new int[arr.length];
        int[] even=new int[arr.length];
        int odd_count=0;
        int even_count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[even_count]=arr[i];
                even_count++;
            }
            else{
                odd[odd_count]=arr[i];
                odd_count++;
            }
        }
        for(int i=0;i<odd_count;i++){
            System.out.print(odd[i]+" ");
        }
        System.out.println();
        for(int i=0;i<even_count;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println(odd_count);
        System.out.println(even_count);
    }
}