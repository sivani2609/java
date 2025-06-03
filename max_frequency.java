import java.util.Scanner;
class max_frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String a = sc.nextLine();
        int alp[] =new int[26];
        int max=0;
        int i=0;
        char c = '\0';
        while(i < a.length())
        {
            int pos=a.charAt(i) - 'a';
            alp[pos]++;
            if(alp[pos]>max){
                max=alp[pos];
                c=a.charAt(i);

            }
            i++;
        }
        if(max>1){
            System.out.println(c+" "+max);
        }
        else{
            System.out.println("-1");
        }
        }
    }