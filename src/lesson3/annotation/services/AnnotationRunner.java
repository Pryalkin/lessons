package lesson3.annotation.services;

import lesson3.annotation.services.impl.SimpleServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationRunner {

    private static int myAnnInitCounter = 0;

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        inspectService(SimpleServiceImpl.class);
//        inspectService(LazyServiceImpl.class);
    }

    private static void inspectService(Class<?> serviceClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if(serviceClass.isAnnotationPresent(MyAnnotationService.class)){
            MyAnnotationService myAnnSer = serviceClass.getAnnotation(MyAnnotationService.class);
            System.out.println(myAnnSer);

            if(serviceClass.isAnnotationPresent(MyAnnotationInit.class)){
                MyAnnotationInit myAnnInit = serviceClass.getAnnotation(MyAnnotationInit.class);
                if (myAnnInit.suppressException()){
                    SimpleServiceImpl ssi = new SimpleServiceImpl();
                    System.out.println(ssi);
                }
            }
        }

        Method[] allMethods = serviceClass.getDeclaredMethods();
        for(Method method : allMethods){
            if(method.getAnnotation(MyAnnotationInit.class) != null){
                if(method.getAnnotation(MyAnnotationInit.class).suppressException()){
                    System.out.println("Here we should to proceed Exceptions: method = " + method);
                } else {
                    myAnnInitCounter++;
                    System.out.println("Here we will pass all Exceptions: method = " + method);
                    method.setAccessible(true);
                    method.invoke(serviceClass.getConstructor().newInstance(), null);
                }
            }
        }
    }
}
