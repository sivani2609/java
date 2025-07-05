// Total Number of Words in a given string 

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s1=sc.nextLine();
        String word[]=s1.trim().split("\\s+");
        if(s1.trim().isEmpty()){
            System.out.println("0 number of words");
        }
        else{
            System.out.print(word.length);
        }
    }
}