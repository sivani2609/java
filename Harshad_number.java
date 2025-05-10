class demo{
    public static void main(String args[]){
        int n=163;
        int sum=0;
        int temp=n;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println(+temp+" is a Harshad Number");
        }
        else{
            System.out.println(+temp+" Not a Harshad Number");
        }
    }
}