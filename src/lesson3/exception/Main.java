package lesson3.exception;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        try {
            System.out.println("Checked Exception for try");
            main.checkedException();
        } catch (IOException e) {
            System.out.println("Checked Exception for catch");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Checked Exception for finally");
        }
        main.myException();
//        main.unCheckedException();
        System.out.println("End");
    }

    public void checkedException() throws IOException {
        throw new IOException("Message: Checked Exception");
    }

    public void unCheckedException(){
        throw new RuntimeException();
    }

    public void myException(){
        try{
            System.out.println("My Exception for try");
            throw new MyException("Message: My exception");
        } catch (MyException e){
            System.out.println("My Exception for catch");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("My Exception for finally");
        }
    }
}
