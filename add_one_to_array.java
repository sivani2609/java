import java.util.Scanner;
class add_one_to_array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean carry=true;
        int[] digits=new int[n];
        for(int i=0;i<n;i++){
            digits[i]=arr[i];
        }
        /*if(arr[n-1] !=9){
            for(int i=n-1;i<n;i++){
                arr[i]=arr[i]+1;
            }
        }else{
            int[] arr1=new int[n+1];
            for(int i=0;i<)
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
        for(int i=n-1;i>=0;i--){
            if(carry){
                if(digits[i] <9){
                    digits[i]++;
                    carry=false;
                }else{
                    digits[i]=0;
                }
            }
        }
        int[] result=new int[n+1];
        if(carry){    
            result[0]=1;
            for(int i=1;i<result.length;i++){
                result[i]=0;
            }
        }
        if(carry){
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
        }else{
            for(int i=0;i<n;i++){
                System.out.print(digits[i]+" ");
            }
        }
    }
}
