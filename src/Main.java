import app.Equation;
import app.SquareBigDecimalEquation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] input) {
        System.out.println("begin");
        Equation<BigDecimal, BigDecimal> eq = new SquareBigDecimalEquation();
        List<BigDecimal> res = eq.solve(Arrays.asList(BigDecimal.valueOf(10), BigDecimal.valueOf(11), BigDecimal.valueOf(12)));
        for (BigDecimal resi : res) {
            System.out.print(String.format("%f ", resi));
        }
        System.out.println("\nend");
    }
}
