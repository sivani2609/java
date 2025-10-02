import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] sort=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sort[i]=arr[i];
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(sort[i]>sort[j]){
                    temp=sort[i];
                    sort[i]=sort[j];
                    sort[j]=temp;
                }
            }
        }
        /*for(int i=0;i<arr.length;i++){
            System.out.print(sort[i]+" ");
        }*/
        int[] result=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==sort[j]){
                    result[i]=j+1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}