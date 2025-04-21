import java.util.Scanner;
class signal_light{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String light = sc.nextLine();
        if(light.equals("red"))
            System.out.println("stop");
        else if(light.equals("yellow"))
            System.out.println("get ready");
        else if(light.equals("green"))
            System.out.println("Go");
    }
}