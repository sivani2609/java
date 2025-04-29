public class q1_calculate{
    void add(int a, int b){
        int add =a+b;
        System.out.println("the addition of a and b is:"+add);
    }
    void sub(int a, int b){
        int sub = a-b;
        System.out.println("teh sub of a and b:"+sub);
    }
    void mul(int a,int b){
        int mul =a+b;
        System.out.println("the multiply of a and b:"+mul);
    }
    void div(int a,int b){
        int div = a/b;
        System.out.println("the division of a and b is"+div);
    }
    public static void main(String[] args) {
        q1_calculate obj1 = new q1_calculate();
        obj1.add(20,10);
        obj1.sub(20,10);
        obj1.mul(20,10);
        obj1.div(20,10);
    }
}