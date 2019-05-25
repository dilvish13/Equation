package app;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class SquareEquation<T extends Number, A extends Number> implements Equation<T, A> {
    public List<T> solve(List<A> args) {
        List<T> res = new ArrayList<>();
        return res;
    }
}
