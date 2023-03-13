package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestNote {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        System.out.println("请开始输入内容，单独输入exit退出");
        while(true){
            String line = scan.nextLine();
            if ("exit".equals(line)){
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("结束了");
        fos.close();
    }
}
