package mtm.interfaces;

import java.util.function.Function;

public interface MethodsTimeMeasurement {

    public <T, R> R run(Function<T, R> function, T t);

}
