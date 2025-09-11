import java.util.Scanner;
class contiguous{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int current=arr[0];
        int max=arr[0];
        int min=arr[0];
         for(int i=1;i<arr.length;i++){
             if(arr[i]<0){
                 int temp=max;
                 max=min;
                 min=temp;
             }
             if(arr[i]>max*arr[i]){
                 max=arr[i];
             }
             else{
                 max=max*arr[i];
             }
             if(arr[i]<min*arr[i]){
                 min=arr[i];
             }
             else{
                 min=min*arr[i];
             }
             if(max>current){
                 current=max;
             }
         }
         System.out.println("Maximum product sub-array = " + current);
    }
}