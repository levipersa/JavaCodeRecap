import fundamentals.coderecap.MissingNumberFromArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Run before each test...");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Run after each test...");
    }

    @Test
    public void computeMissingNumber_ShouldReturnMissingNumber() {
        //given
        int[] testVector = {1,2,3,5,10,9,6,8,7};

        //when
        int missingNumber = MissingNumberFromArray.computeMissingNumber(testVector);

        //then
        assertEquals(4, missingNumber);
    }

    @ParameterizedTest
    @MethodSource("generateVectors")
    public void computeMissingNumber_ShouldReturnMissingNumberInAllCases(int[] testVector) {

        assertEquals(3, MissingNumberFromArray.computeMissingNumber(testVector));


    }

    private static Stream<int[]> generateVectors() {
        return Stream.of(new int[]{1,2,3,5,10,9,6,8,7}, new int[]{1,2,6,5,4});
    }

}














