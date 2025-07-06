//Adding the number from the String input 
//Input: 5ingt44t3 
//Output: 52

class demo{
    public static void main(String args[]){
        String str="5ingt44t3";
        int sum=0;
        String num="";
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                num=num+ch;
            }
            else{
                if(!(num.isEmpty())){
                    sum=sum+Integer.parseInt(num);
                    num="";
                }
            }
        }
        if(!(num.isEmpty())){
            sum=sum+Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}