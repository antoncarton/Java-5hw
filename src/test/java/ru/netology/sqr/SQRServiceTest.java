package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/paremeters.csv")

    public void testAmountOfNumbersInRange(int expected , int lo , int hi) {
        SQRService service = new SQRService();

        int actual = service.calcAmountOfSqrtInRange(lo, hi);

        Assertions.assertEquals(expected, actual);
    }

}
