package app;

import java.util.List;

public interface Equation<T extends Number, A extends Number> {
    List<T> solve(List<A> args);
}
