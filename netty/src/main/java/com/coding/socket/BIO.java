package com.coding.socket;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yaCoding
 * @create 2022-10-12 下午 8:11
 */

public class BIO {

    //是否要关闭服务
    static boolean stop = false;
    public static void main(String[] args) throws Exception {
        int connectionNum = 0;
        //服务  ip + port
        int port = 8888;
        ExecutorService service = Executors.newCachedThreadPool();
        //创建socket服务
        ServerSocket serverSocket = new ServerSocket(port);
        while (!stop) {
            if (10 == connectionNum) {
                stop = true;
            }
            Socket socket = serverSocket.accept();
            service.execute(() -> {
                try {
                    Scanner scanner = new Scanner(socket.getInputStream());
                    PrintStream printStream = new PrintStream(socket.getOutputStream());
                    while (!stop) {
                        String s = scanner.next().trim();
                        printStream.println("PONG:" + s);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            connectionNum++;
        }
        service.shutdown();
        serverSocket.close();
    }

}
