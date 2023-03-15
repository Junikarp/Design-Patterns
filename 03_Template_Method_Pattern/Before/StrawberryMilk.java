public class StrawberryMilk {
    public void makeStrawberryMilk() {
        buyMilk();
        boilMilk();
        putStrawberry();
        coolDown();
    }
    private void buyMilk() {
        System.out.println("우유를 삽니다.");
    }
    private void boilMilk() {
        System.out.println("우유를 끓입니다.");
    }
    private void putStrawberry() {
        System.out.println("딸기를 넣습니다.");
    }
    private void coolDown() {
        System.out.println("완성품을 식힙니다.");
    }
}