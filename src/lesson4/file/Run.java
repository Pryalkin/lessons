package lesson4.file;

import java.io.*;

public class Run {
    public static void main(String[] args) {
//        example1();
        example2();
    }

    private static void example2() {
        int y, sum = 0;
        try(DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("hello.dat")))){
            for (int i = 0; i < 20; i++) {
                dataOut.writeInt(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(DataInputStream dataIn = new DataInputStream(new BufferedInputStream(new FileInputStream("hello.dat")))){
            while (dataIn.available() > 0){
                y = dataIn.readInt();
                System.out.println(y);
                sum+=y;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Sum: " + sum);

    }

    private static void example1() {
        String line;
        int i = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"))){
            while ((line = bufferedReader.readLine()) != null){
                for (byte b: line.getBytes()) {
                    if (b == 32){
                        i++;
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
