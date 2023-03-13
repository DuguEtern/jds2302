package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(Integer.parseInt("懒"));
        bw.write(Integer.parseInt("懒"));
        System.out.println("懒");
        bw.close();
    }
}
