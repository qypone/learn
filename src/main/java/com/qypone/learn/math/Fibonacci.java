package com.qypone.learn.math;

/**
 * 斐波那契数量的递归、循环实现
 */
public class Fibonacci {

  public static void main(String[] args) {

    long l = System.currentTimeMillis();
    int result_1 = fibonacci_1(40);
    System.out.println(result_1);

    long l1 = System.currentTimeMillis();
    System.out.println(l1-l);
    int result_2 = fibonacci_2(40);

    System.out.println(result_2);
    long l2 = System.currentTimeMillis();
    System.out.println(l2-l1);
  }

  public static int fibonacci_2(int n) {
    if(n == 0) {
      return 0;
    }
    if(n == 1) {
      return 1;
    }
    return fibonacci_2(n-1) + fibonacci_2(n-2);
  }

  public static int fibonacci_1(int n) {
    int[] res = {0, 1};
    if(n < 2) {
      return res[n];
    }
    int first = 0;
    int second = 1;
    int fibn = 0;
    for(int i = 2; i <= n; i++) {
      fibn = first + second;
      first = second;
      second = fibn;
    }
    return fibn;
  }

}
