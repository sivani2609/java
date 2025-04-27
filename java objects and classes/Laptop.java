public  class Laptop{
    String name = "";
    String proc = "";
    int ram = 0;
    int price =0;
    public static void main(String[] args) {
        Laptop lap1 = new Laptop();
        lap1.name = "hpp";
        lap1.proc = "i5";
        lap1.ram = 6;
        lap1.price = 40000;

        Laptop lap2 = new Laptop();
        lap2.name = "lenova";
        lap1.proc = "i7";
        lap1.ram = 12;
        lap1.price = 60000;
        System.out.println(lap2.ram);
    }
}