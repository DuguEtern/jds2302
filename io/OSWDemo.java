package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        osw.write("和我在成都的街头走一走，哦哦哦哦...");
        osw.write("直到所有的灯都熄灭了也不停留");
        System.out.println("写出完毕!");
        osw.close();
    }
}
