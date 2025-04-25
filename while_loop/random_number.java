import java.util.Random;
class random_number{
    public static void main(String args[]){
        Random rand = new Random();
        int number = 0;
        while(number !=5){
        number = rand.nextInt(3);
        System.out.println(number);
    }}}
