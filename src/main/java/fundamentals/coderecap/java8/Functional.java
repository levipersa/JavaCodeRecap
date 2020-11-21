package fundamentals.coderecap.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Functional {

    public static void main(String[] args) {
        Function<String, Integer> functionLambda = s -> s.length();
//        Function<String,Integer> function=new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        };
        // System.out.println( function.apply("Magazin"));
        System.out.println(functionLambda.apply("Masina"));


        Consumer<String> consumer = t -> System.out.println(t);
        consumer.accept("Car");
        List<String> cars = new ArrayList<>();
        cars.add("Dacia");
        cars.add("Volvo");
        cars.forEach(t -> System.out.println(t));

        BinaryOperator<Integer> binaryOperator = (t, s) -> t + s;
        System.out.println(binaryOperator.andThen(x -> x * x).apply(3, 2));

        Predicate<Integer> predicate = t -> t > 10;
        System.out.println(predicate.test(9));

        BiFunction<Integer, Integer, String> biFunction = (t, s) -> t.toString() + s.toString();
        System.out.println(biFunction.apply(12, 34));

        BiFunction<Integer, Integer, String> anotherBiFunction = Functional::concatenateIntegers;
        System.out.println(anotherBiFunction.apply(35, 53));

    }

    public static String concatenateIntegers(Integer firstInt, Integer secondInt) {
        return firstInt.toString() + secondInt.toString();
    }

}











