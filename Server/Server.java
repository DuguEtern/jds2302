package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
聊天室的客户端
 */
public class Server {
    private ServerSocket serverSocket;
    public Server (){
        System.out.println("正在启动服务端");
        try {
            /*
            `如果端口被其他程序占用了,就会报异常,解决方法:更换端口号
            2.杀死占用该端口的进程(通常发什么在服务器端两次启动导致的情况下)--会演示情况
            我们将ServerSocket比喻为某客服中心的的主机
             */
            serverSocket =  new ServerSocket(8080);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        /*
            ServerScoket提供重要的方法:
            Socket 一accept
            用于接受客户端的连接,并返回一个Socket实例与连接的客户端交互
            该方法是一个阻塞方法,调用后程序会卡住,直到一个客户端连接为止
         */
        try {
            System.out.println("等待客户端链接");
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String message;

            while ((message=br.readLine())!=null){
                //String message = br.readLine();
                System.out.println("客户端:"+message);
                if ("exit".equals(message)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //因为main中是静态方法,所以需要打点调用,不可以直接调用
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
        // start();
    }
}