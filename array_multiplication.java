
import java.util.Arrays;

class demo{
    public static void main(String args[]){
        int [] a={10,9,8};
        int [] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i]*2;
        }
        System.out.println(Arrays.toString(b));

    }
}