package services;

public class MyService {

    public Object findData(Object requestParameter) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return requestParameter;
    }

}
