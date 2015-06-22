package mtm.implementations;

import java.util.function.Function;

import mtm.interfaces.MethodsTimeMeasurement;

public class SimpleMethodsTimeMeasurement implements MethodsTimeMeasurement {

    public <T, R> R run(Function<T, R> function, T inputParameter) {

        long startTime = System.currentTimeMillis();
        R r = function.apply(inputParameter);
        long elapsedTime = System.currentTimeMillis() - startTime;

        System.out.println("inputParameter -> " + inputParameter);
        System.out.println("elapsedTime -> " + elapsedTime);

        return r;
    }

}
