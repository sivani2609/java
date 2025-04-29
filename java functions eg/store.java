public class store{
    void getshop(int money){
        System.out.println(money);
        System.out.println("soap puchased");
    }
    public static void main(String[] args) {
        store obj1 = new store();
        obj1.getshop(20);
    }
}