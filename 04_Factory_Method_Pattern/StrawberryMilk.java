public class StrawberryMilk implements Milk{
    @Override
    public void complete() {
        System.out.println("딸기우유 완성");
    }
    @Override
    public void drink() {
        System.out.println("딸기우유 냠냠");
    }
}