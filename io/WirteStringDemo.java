package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WirteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos。txt",true);
        String line = "心跳是爱情如烈火，你在笑疯狂的人是我";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write("，爱如火会温暖了心窝".getBytes(StandardCharsets.UTF_8));

        System.out.println("写出完毕!");
        fos.close();
    }
}
