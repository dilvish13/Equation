package app;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@NoArgsConstructor
public class SquareBigDecimalEquation extends SquareEquation<BigDecimal, BigDecimal> {
    @Override
    public List<BigDecimal> solve(List<BigDecimal> args) {
        double d = sqrt(pow(args.get(1).doubleValue(), 2) - 4 * args.get(0).doubleValue() * args.get(2).doubleValue());
        double x1 = (-args.get(0).doubleValue() - d) / 2;
        double x2 = (-args.get(0).doubleValue() + d) / 2;
        return Arrays.asList(BigDecimal.valueOf(x1), BigDecimal.valueOf(x2));
    }
}
