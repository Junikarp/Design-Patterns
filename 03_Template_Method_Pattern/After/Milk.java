abstract class Milk {
    public void makeMilk() {
        System.out.println("우유를 삽니다.");
        System.out.println("우유를 끓입니다.");

        getFruit();

        System.out.println("완성품을 식힙니다.");
    }
    protected abstract void getFruit();
}