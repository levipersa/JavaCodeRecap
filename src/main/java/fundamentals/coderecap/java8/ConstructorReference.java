package fundamentals.coderecap.java8;

public class ConstructorReference {

    public static void main(String[] args) {

        Messageable message = Message::new;
        message.getMessage("Hello World");

    }

}









