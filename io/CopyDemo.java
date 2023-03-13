package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("zsw.jpg");
        FileOutputStream fos = new FileOutputStream("zsw_cp.jpg");

        long start = System.currentTimeMillis();
        int d;
        while ((d=fis.read())!=-1){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");

        fis.close();
        fos.close();
    }
}
