import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "500,100000,true",
//            "100,10000,false",
//            "300,10000,true",
//    })
    @CsvFileSource (files="src/test/resources/data.csv")

    public void BonusAccrual (int expected, int amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

}
