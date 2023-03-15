public class BananaMilk() {
    public void makeBananaMilk() {
        buyMilk();
        boilMilk();
        putBanana();
        coolDown();
    }
    private void buyMilk() {
        System.out.println("우유를 삽니다.");
    }
    private void boilMilk() {
        System.out.println("우유를 끓입니다.");
    }
    private void putBanana() {
        System.out.println("바나나를 넣습니다.");
    }
    private void coolDown() {
        System.out.println("완성품을 식힙니다.");
    }
}