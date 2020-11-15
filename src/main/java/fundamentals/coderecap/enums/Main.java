package fundamentals.coderecap.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(PizzaStatus.DELIVERED.isDelivered());
        System.out.println(PizzaStatus.DELIVERED.isReady());
    }
}
