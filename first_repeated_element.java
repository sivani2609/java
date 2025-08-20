import java.util.Scanner;
class first_repeated_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean invalid = true;
        for(int i=0;i<n;i++){
            if(arr[i] >0){
                invalid = false;
                break;
            }
        }
        if(invalid){
            System.out.println("0");
        }
        boolean found = false;
        for(int i=0;i<n && !found;i++){
            if(arr[i] > 0) continue;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            for(int i=0;i<n;i++){
                if(arr[i] > 0){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
