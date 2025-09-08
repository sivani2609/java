import java.util.Scanner;
class Maximum_scalar_product{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int temp1=0;
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    temp1=b[i];
                    b[i]=b[j];
                    b[j]=temp1;
                }
            }
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<a.length;i++){
            int c=a[i]*b[i];
            sum=sum+c;
        }
        System.out.println("Maximum scalar product:"+sum);
    }
}