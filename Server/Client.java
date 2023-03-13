package Server;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务器...");
            socket = new Socket("176.5.114.1",8088);
            System.out.println("一个客户端连上了");
        } catch (IOException e) {
        }
    }
        public void start () {
            try {
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw, true);
                Scanner scan = new Scanner(System.in);
                while (true) {
                    String line = scan.nextLine();
                    if ("exit".equals(line)) {
                        ;
                        break;
                    }
                    pw.println(line);
                }
            }catch (IOException e){
                e.printStackTrace();
            } finally {

            }
        }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
