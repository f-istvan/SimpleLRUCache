package chachetester;

import java.util.Random;

import services.MyService;
import lrucache.SimpleLRUCache;
import mtm.interfaces.MethodsTimeMeasurement;

public class CacheTesterMTM {

    private Random random = new Random();
    private MyService myService = new MyService();
    private MethodsTimeMeasurement methodsTimeMeasurement;
    private final int capacity;
    private SimpleLRUCache<Object, Object> simpleLRUCache;

    {
        capacity = 10;
        simpleLRUCache = new SimpleLRUCache<>(capacity);
    }

    public CacheTesterMTM(MethodsTimeMeasurement methodsTimeMeasurement) {
        super();
        this.methodsTimeMeasurement = methodsTimeMeasurement;
    }

    public void run() {
        for (int i = 1; i <= 50; ++i) {
            methodsTimeMeasurement.run((x) -> runTest(x), random.nextInt(20));
        }

        for (Float f = 1.0F; f <= 200.0F; ++f) {
            methodsTimeMeasurement.run(x -> runTest(x), f);
        }

        for (int i = 1; i <= 200; ++i) {
            methodsTimeMeasurement.run(x -> runTest(x), "Works with Strings as well");
        }

    }

    private Object runTest(Object inputData) {
        Object returnValue = null;
        if (simpleLRUCache.containsKey(inputData)) {
            returnValue = simpleLRUCache.get(inputData);
        } else {
            returnValue = myService.findData(random.nextInt(200));
            simpleLRUCache.put(inputData, returnValue);
        }
        System.out.println(simpleLRUCache);
        return returnValue;
    }

}
