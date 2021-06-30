import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class UtilsTest {

    @Test
    void isPositive_for_positive_bigdecimal() {
        boolean isPositive = Utils.isPositive(new BigDecimal(100));
        Assertions.assertEquals(isPositive, true);
    }

    @Test
    void isPositive_for_negative_bigdecimal() {
        boolean isPositive = Utils.isPositive(new BigDecimal(-100));
        Assertions.assertEquals(isPositive, false);
    }
}