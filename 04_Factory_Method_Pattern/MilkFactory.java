public interface MilkFactory {
    Milk orderMilk() {
        Milk milk = createMilk();
        milk.complete();
        return milk;
    }
    Milk createMilk();
}