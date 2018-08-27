package com.tancw.io;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

/**
 * Created by Administrator on 2018/8/27.
 */
public class SocketServer {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        InputStream inputStream = null;
        try {
            int port = 55533;
            server = new ServerSocket(port);
            System.out.println("server将等待连接过来");
            socket = server.accept();
            inputStream = socket.getInputStream();
            System.out.println(IOUtils.toString(inputStream, Charset.forName("GBK")));
        } catch (Exception e) {

        } finally {
            try {
                if (inputStream != null) inputStream.close();
                if (socket != null) socket.close();
                if (server != null) server.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
