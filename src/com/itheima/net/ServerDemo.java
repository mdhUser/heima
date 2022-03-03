package com.itheima.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {


    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(8888);

            System.out.println("监听端口号：8888");
            Socket s = ss.accept();
            System.out.println("有连接过来" + s);
            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}