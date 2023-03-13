package evensong;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try (
            FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}
