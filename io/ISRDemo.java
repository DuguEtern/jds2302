package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d;
        while ((d= isr.read())!=-1){
            System.out.println((char)d);
        }
        isr.close();
    }
}
