package Test;

import Main.IntegerInputNumberToBinaryConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerInputNumberToBinaryConversionTest {

    IntegerInputNumberToBinaryConversion testCase36 = new IntegerInputNumberToBinaryConversion(4);
    IntegerInputNumberToBinaryConversion testCase37 = new IntegerInputNumberToBinaryConversion(9);

    IntegerInputNumberToBinaryConversion testCase38 = new IntegerInputNumberToBinaryConversion(-2);

    IntegerInputNumberToBinaryConversion testCase39 = new IntegerInputNumberToBinaryConversion(10001);

    IntegerInputNumberToBinaryConversion testCase40 = new IntegerInputNumberToBinaryConversion(1.5);




    @Test
    void testingIntegerInputNumberForBinaryConversion() {

        double testResult = testCase36.getNum1();
        assertNotNull(testResult);


    }



    @Test
    void testingResultForPositiveIntegerToBinaryConversion() {

        String testResult = testCase37.getResult();
        assertEquals("1001",testResult);

    }


    @Test
    void testingResultForNegativeIntegerToBinaryConversion() {


        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase38.getResult();
                }
        );

        assertEquals("Input number cannot be negative !", exception.getMessage());


    }

    @Test
    void testingResultForLargeIntegerToBinaryConversion() {




        Throwable exception = assertThrows(
                ArrayIndexOutOfBoundsException.class, () -> {

                    testCase39.getResult();
                }
        );

        assertEquals("Input number is too much large !", exception.getMessage());


    }

    @Test
    void testingResultForFloatInputNumberInIntegerToBinaryConversion() {




        Throwable exception = assertThrows(
                RuntimeException.class, () -> {

                    testCase40.getResult();
                }
        );

        assertEquals("Input number cannot be fractional !", exception.getMessage());


    }


}