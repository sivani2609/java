import java.util.Scanner;
class demo{
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
        System.out.print("no left rotation to be rotated");
        int d=sc.nextInt();
        int[] temp=new int[arr.length];
        int k=0;
        for(int i=d;i<arr.length;i++){
            temp[k]=arr[i];
            k++;
        }
        for(int i=0;i<d;i++){
            temp[k]=arr[i];
            k++;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}