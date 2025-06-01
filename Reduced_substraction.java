public class Reduced_substraction{
    public static int reduce(int n){
        while(n>9){
            int res=0;
            String s=n+"";
            for(int i=0;i<s.length()-1;i++){
                int digit1=s.charAt(i)-'0';
                int digit2=s.charAt(i+1)-'0';
                res=res*10+Math.abs(digit1-digit2);

            }
            n=res;
        }
        return n;
    }
    public static void main(String args[]){
        int n=6972;
        System.out.println(reduce(n));
    }

}
