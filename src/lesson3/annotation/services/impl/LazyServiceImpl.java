package lesson3.annotation.services.impl;

import lesson3.annotation.services.MyAnnotationInit;
import lesson3.annotation.services.MyAnnotationService;
import lesson3.annotation.services.LazyService;

@MyAnnotationService(name = "lazyService", lazyLoad = true)
public class LazyServiceImpl implements LazyService {

    @Override
    @MyAnnotationInit(suppressException = true)
    public void lazyInit() throws Exception {
        System.out.println("From public lazyInit() method");
    }

    @MyAnnotationInit
    private void secondLazyInit(){
        System.out.println("From private secondLazyInit() method");
    }
}
