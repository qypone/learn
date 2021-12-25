package com.qypone.learn.equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerEqualsTest {

  @Test
  public void test() {

    /**
     * 编译器会把 Integer a = 127 转换为 Integer.valueOf(127)。
     * 查看源码可以发现，这个转换在内部其实做了缓存，使得两个 Integer 指向同一个对象，所以 == 返回 true
     */
    Integer a = 127; //Integer.valueOf(127)
    Integer b = 127; //Integer.valueOf(127)
    assertTrue(a == b);

    /**
     * 之所以同样的代码 128 就返回 false 的原因是，默认情况下会缓存[-128, 127]的数值，而 128 处于这个区间之外
     * 设置 JVM 参数加上 -XX:AutoBoxCacheMax=1000 再试试，是不是就返回 true 了呢
     */
    Integer c = 128; //Integer.valueOf(128)
    Integer d = 128; //Integer.valueOf(128)
    assertFalse(c == d);

    //比较一个新对象和一个来自缓存的对象
    Integer e = 127; //Integer.valueOf(127)
    Integer f = new Integer(127); //new instance
    assertFalse(e == f);

    //比较两个新对象
    Integer g = new Integer(127); //new instance
    Integer h = new Integer(127); //new instance
    assertFalse(g == h);

    //较，前者会先拆箱再比较，比较的肯定是数值而不是引用，因此返回 true
    Integer i = 128; //unbox
    int j = 128;
    assertTrue(i == j);
  }

}