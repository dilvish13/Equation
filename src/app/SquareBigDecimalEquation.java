package app;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
public class SquareBigDecimalEquation extends SquareEquation<BigDecimal, BigDecimal> {
    @Override
    public List<BigDecimal> solve(List<BigDecimal> args) {
        List<BigDecimal> res = new ArrayList<>();
        res = Arrays.asList(BigDecimal.valueOf(0), BigDecimal.valueOf(1));
        return res;
    }
}
