public class BananaMilk implements Milk{
    @Override
    public void complete() {
        System.out.println("바나나우유 완성");
    }
    @Override
    public void drink() {
        System.out.println("바나나우유 냠냠");
    }
}