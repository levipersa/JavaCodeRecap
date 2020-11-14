package fundamentals.coderecap;

public class Child extends Parent {
    int age;

    @Override
    public void message() {
        System.out.println("Method from child");
    }
}
