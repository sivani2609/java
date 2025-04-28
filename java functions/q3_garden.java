class q3_garden{
    int apple_price =20;
    int apple_count=5;
    void total_money(){
        int total_amount = apple_price*apple_count;
        System.out.println("the total amount: "+total_amount);
    }
    public static void main(String[] args) {
        q3_garden obj1 = new q3_garden();
        obj1.total_money();
    }
}