class demo{
    public static void main(String args[]){
        int[] arr={40,20,10,50,20,10,30,40};
        boolean[] visit=new boolean[arr.length];
        int[] uniq=new int[arr.length];
        int[] freq=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(visit[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count=count+1;
                    visit[j]=true;
                }
            }
            //System.out.println(arr[i]+"--"+count);
            uniq[k]=arr[i];
            freq[k]=count;
            k=k+1;
        }
        int temp1=0;
        int temp2=0;
        for(int i=0;i<k-1;i++){
            for(int j=i+1;j<k;j++){
                if(freq[i]>freq[j]){
                    temp1=freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp1;
                    
                    temp2=uniq[i];
                    uniq[i]=uniq[j];
                    uniq[j]=temp2;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(uniq[i]+"--"+freq[i]);
        }
    }
}
