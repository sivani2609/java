import java.util.Scanner;
class middle_element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size = sc.nextInt();
        int[] number = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println("enter number:");
            number[i] = sc.nextInt();
        }
        if(size%2 != 0){
            System.out.println("the middle element is"+number[size/2]);
        }else{
            int mid1 = number.length/2 - 1;
            int mid2 = number.length/ 2;
            int middle = (number[mid1] + number[mid2])/2;
            System.out.println("the middle element is:"+middle);
        }

    }}