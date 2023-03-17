public class Make {
    public static void main(String[] args){
        StrawberryMilkFactory strawberryMilkFactory = new StrawberryMilkFactory();
        Milk milk1 = strawberryMilkFactory.orderMilk();
        milk1.drink();

        BananaMilkFactory bananaMilkFactory = new BananaMilkFactory();
        Milk milk2 = bananaMilkFactory.orderMilk();
        milk2.drink();
    }
}