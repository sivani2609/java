import java.util.Scanner;
class longest_palindrome{
    
    public static boolean ispalindrome(int numb){
        int number = numb;
        int rev=0;
        while(number !=0){
            int digit = number%10;
            rev = rev*10+digit;
            number = number /10;
        }
        if(rev == numb){
            return true;
        }else{
            return false;
        }
    }
    /*public static boolean printing_palindrome(int value_num){
        int number = value_num;
        int rev=0;
        while(number !=0){
            int digit = number%10;
            rev = rev*10+digit;
            number = number /10;
        }
        if(rev == value_num){
            return true;
        }else{
            return false;
        }
    }*/
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int palindrome_count=0;
    for(int i=0;i<n;i++){
        int num=arr[i];
    if(ispalindrome(num)){
        palindrome_count++;
        }
    } 
    int[] arr1=new int[palindrome_count];
    int index=0;
    for(int i=0;i<n;i++){
        int value=arr[i];
        if(ispalindrome(value)){
            arr1[index++]=value;
        }
    }
    int max=arr1[0];
    for(int i=0;i<palindrome_count;i++){
        if(arr1[i]>max){
            max=arr1[i];
        }
    }
    System.out.println(max);
    }
}
