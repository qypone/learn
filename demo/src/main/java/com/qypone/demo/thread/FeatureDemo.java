package com.qypone.demo.thread;

import java.util.Random;
import java.util.concurrent.*;

public class FeatureDemo {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newCachedThreadPool();
    Future<Integer> reslut = executorService.submit(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        return new Random().nextInt(100);
      }
    });

    executorService.shutdown();

    try {
      Integer integer = null;
      integer = reslut.get();
      System.out.println(integer);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
