package com.qypone.learn.nio;

import java.io.IOException;
import java.net.ServerSocket;

public class Socket {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9001);

    while (true) {
      serverSocket.accept();
      printSocket();
    }
  }

  private static void printSocket() {
    try {
      // 模拟业务线程操作
      Thread.sleep(20);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Hello Socket");
  }
}
