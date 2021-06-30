import java.math.BigDecimal;

public final class Utils {

    private Utils(){}

    public final static boolean isPositive(BigDecimal value) {
        return value != null && value.signum() == 1;
    }

}
