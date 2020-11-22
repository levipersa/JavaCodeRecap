package fundamentals.coderecap.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Ala", "bala", "portocala");

        Stream<String> stringSteam = strings.stream().filter(t -> !t.equals("bala") );

        List<String> resultStrings = stringSteam.collect(Collectors.toList());

        resultStrings.forEach(t -> System.out.println(t));


    }

}




