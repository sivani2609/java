/*
Java program to determine the array is a subset of another array
arr1 = {1,2,3,4,5}  , arr2 = {3,4,5}
arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)
arr3 = {1,2,3,4,5}   arr4 = {1,2,9}
*/

import java.util.Scanner;
class demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[3];
        int[] arr3=new int[5];
        int[] arr4=new int[3];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
        }
        for(int i=0;i<arr4.length;i++){
            arr4[i]=sc.nextInt();
        }
        boolean subset=true;
        for(int i=0;i<arr2.length;i++){
            boolean found=false;
            for(int j=i;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                subset=false;
                break;
            }
        }
        if(subset){
            System.out.println("arr2 is subset of arr1");
        }
        else{
            System.out.println("arr2 is not subset of arr1");
        }
        boolean issubset=true;
        for(int i=0;i<arr4.length;i++){
            boolean found=false;
            for(int j=i;j<arr3.length;j++){
                if(arr4[i]==arr3[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                subset=false;
                break;
            }
        }
        if(issubset){
            System.out.println("arr3 is subset of arr4");
        }
        else{
            System.out.println("arr3 is not subset of arr4");
        }
    }
}