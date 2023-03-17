public class StrawberryMilkFactory implements MilkFactory {
    @Override
    public Milk createMilk() {
        return new StrawberryMilk();
    }
}