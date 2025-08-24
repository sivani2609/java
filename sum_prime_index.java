import java.util.Scanner;
class sum_prime_index{
    public static boolean isprime(int index){
        if(index<2){
            return false;
        }
        for(int i=2;i*i<=index;i++){
            if(index%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumofprimeindex(int[] arr,int n){
        int sum=0;
        for(int i=2;i<n;i++){
            if(isprime(i)){
                sum=sum+arr[i];
            }
    }
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int result = sumofprimeindex(arr,n);
        System.out.println(result);
    }
}
