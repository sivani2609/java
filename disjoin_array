import java.util.Scanner;
class arr_disjoint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        boolean same =true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    same=false;
                    break;
                }
            }
        }
        if(same){
            System.out.println("arrays are disjoint");
        }else{
            System.out.println("arrays are not disjoint");
        }
    }
}
