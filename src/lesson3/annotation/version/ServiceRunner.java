package lesson3.annotation.version;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServiceRunner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        inspectService(MyService.class);
    }

    private static void inspectService(Class<?> myServiceClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyService myService;
        if(myServiceClass.isAnnotationPresent(Version.class)){
            myService = (MyService) myServiceClass.getConstructor().newInstance();
            Method[] allMethods = myServiceClass.getDeclaredMethods();
            for (Method method : allMethods) {
                if (method.getName().equals("setField")) {
                    method.invoke(myService, "test");
                }
                if (method.getName().equals("thisClassInfo")){
                    method.setAccessible(true);
                    method.invoke(myService, null);
                }
            }
        }
    }
}
