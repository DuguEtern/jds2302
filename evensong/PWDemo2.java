package evensong;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("px.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        Scanner scan = new Scanner(System.in);
        System.out.println("请开始输入内容，单独输入exit时退出");
        while (true){
            String line = scan.nextLine();
            if ("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        pw.close();
    }
}
