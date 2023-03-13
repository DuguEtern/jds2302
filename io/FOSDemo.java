package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
          文件输出流两个常用的构造器:
          1)FileOutputStream(String fileName)
          2)FileOutputStream(File file)
          文件流创建时如果指定的文件不存在则会自动创建，前提是该文件所在的目录必须存在，若不存在则发生异常
         */
        File file = new File("fos.dat");
        FileOutputStream fos = new FileOutputStream(file,true); //根据File实例定义文件输出流
        //FileOutputStream fos = new FileOutputStream("fos.dat"); //定义文件输出流
        /*
          OutputStream(所有字节输出流的超类)上定义了写出字节的相关方法:write()
          void write(int d):
            通过该输出流向目标位置写出1个字节，写出的是给定的int值对应的2进制的"低八位"

          当fos.write(1)时，向fos.dat中写入了1个字节
          int值1的2进制样子: 00000000 00000000 00000000 00000001
                                                     ^^^^^^^^
                                                     写入该字节
          write()后，fos.dat文件内容(长度为1字节):
          00000001

          当fos.write(2)时，又向fos.dat中写入了1个字节
          int值2的2进制样子: 00000000 00000000 00000000 00000010
                                                      ^^^^^^^^
                                                      写入该字节
          write()后，fos.dat文件内容(长度为2字节):
          00000001 00000010
         */
        /*
          当fos.write(-1)时，向fos中写入了1个字节
          int值-1的2进制样子：11111111 11111111 11111111 11111111
                                                      ^^^^^^^^
                                                      写入该字节
          write()后，fos.dat文件内容
          11111111
         */
        fos.write(1); //向fos.dat中写入了1个字节
        fos.write(2); //向fos.dat中又写入了1个字节
        //fos.write(-1);

        //认为读出256的发花  认为读出255的发火箭  认为读出0的发666  认为读出1的发小汽车
        System.out.println("写出完毕!");
        fos.close(); //关闭流
    }
}















