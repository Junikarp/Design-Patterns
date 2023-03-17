public class BananaMilkFactory implements MilkFactory {
    @Override
    public Milk createMilk() {
        return new BananaMilk();
    }
}