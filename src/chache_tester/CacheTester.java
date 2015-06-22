package chache_tester;

import mtm.implementations.SimpleMethodsTimeMeasurement;

public class CacheTester {

    public static void main(String[] args) {
        SimpleMethodsTimeMeasurement mtm1 = new SimpleMethodsTimeMeasurement();
        CacheTesterMTM cacheTesterMTM1 = new CacheTesterMTM(mtm1);
        cacheTesterMTM1.run();

        SimpleMethodsTimeMeasurement mtm2 = new SimpleMethodsTimeMeasurement();
        CacheTesterMTM cacheTesterMTM2 = new CacheTesterMTM(mtm2);
        cacheTesterMTM2.run();

        SimpleMethodsTimeMeasurement mtm3 = new SimpleMethodsTimeMeasurement();
        CacheTesterMTM cacheTesterMTM3 = new CacheTesterMTM(mtm3);
        cacheTesterMTM3.run();
    }

}
