package lesson3.annotation.services.impl;

import lesson3.annotation.services.MyAnnotationInit;
import lesson3.annotation.services.MyAnnotationService;
import lesson3.annotation.services.SimpleService;

@MyAnnotationService(name = "simpleService")
public class SimpleServiceImpl implements SimpleService {

    private int a = 10;

    @Override
    @MyAnnotationInit(suppressException = true)
    public void initService() {
        System.out.println("From initService() method");
    }

    @MyAnnotationInit
    private void printMe(){
        System.out.println("From private method " + a);
    }
}
