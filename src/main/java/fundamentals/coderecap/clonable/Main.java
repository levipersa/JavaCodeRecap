package fundamentals.coderecap.clonable;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

//        SimpleObject simpleObject = new SimpleObject();
//        SimpleObject anotherSimpleObject = simpleObject;
//
//        anotherSimpleObject.setFirstField(500);
//
//        System.out.println("Simple Object: " + simpleObject + " another object: " + anotherSimpleObject);

        DependenciesObject firstObject = new DependenciesObject();
        firstObject.setFirstField(10);
        firstObject.setSecondField(21);

        DependenciesObject secondObject = firstObject.clone();
        secondObject.getSimpleObject().setFirstField(198);
        secondObject.setFirstField(555);

        System.out.println("First obj: " + firstObject + " second obj: " + secondObject);

    }

}
