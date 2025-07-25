class demo{
    public static void main(String args[]){
        String inp="aaabccccddaaaaab";
        String result="";
        int count=1;
        for(int i=1;i<inp.length();i++){
            if(inp.charAt(i)==inp.charAt(i-1)){
                count=count+1;
            }
            else{
                result=result+inp.charAt(i-1);
                if(count>1){
                    result=result+count;
                }
                count=1;
            }
        }
        result=result+inp.charAt(inp.length()-1);
        System.out.println(result);
    }
}