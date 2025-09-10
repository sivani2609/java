import java.util.Scanner;
class demo{
    public static void main(String args[]){
        int arr[][]={
            {10,20},
            {20,30},
            {50,60},
            {20,10},
            {40,30},
            {30,20}
        };
        System.out.println("Symmetric:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.println("("+arr[i][0]+","+arr[i][1]+")");
                }
            }
        }
    }
}