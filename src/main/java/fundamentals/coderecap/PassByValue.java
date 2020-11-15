package fundamentals.coderecap;

public class PassByValue {

    public static void main(String[] args) {

        Dog doggo1 = new Dog("Rex");

        changeDog(doggo1);

        System.out.println(doggo1.getName());

        changeDogObject(doggo1);

        System.out.println(doggo1.getName());


    }


    public static void changeDog(Dog dog) {

        dog = new Dog("Lassie");

    }

    public static void changeDogObject (Dog dog){

        dog.setName("Lassie");

    }


    private static class Dog {

        public String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
