package io;

import java.io.*;

public class CopyDemo3Buffered {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("APS.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("APS.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int d;
        while ((d= bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕耗时:"+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}
