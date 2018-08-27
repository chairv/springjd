package com.tancw.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

/**
 * Created by Administrator on 2018/8/27.
 */
public class SocketClient {
    public static void main(String[] args) {
        int port = 55533;
        String host = "127.0.0.1";
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("xhj0001#13950000000003861#20140805#@@@@".getBytes("GBK"));
            socket.shutdownOutput();

            IOUtils.toString(socket.getInputStream(), Charset.forName("GBK"));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
