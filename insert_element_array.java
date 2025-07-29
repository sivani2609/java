class demo{
    public static void main(String args[]){
        int [] arr={10,20,40,50};
        int pos=3;
        int ele=30;
        int[] newarr=new int[arr.length+1];
        for(int i=0;i<pos-1;i++){
            newarr[i]=arr[i];
        }
        newarr[pos-1]=ele;
        for(int i=pos;i<newarr.length;i++){
            newarr[i]=arr[i-1];
        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}