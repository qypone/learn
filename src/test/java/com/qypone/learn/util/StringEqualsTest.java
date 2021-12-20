package com.qypone.learn.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringEqualsTest {

  @Test
  public void test() {
    //因为 Java 的字符串驻留机制，直接使用双引号声明出来的两个 String 对象指向常量池中的相同字符串
    String a = "1";
    String b = "1";
    assertTrue(a == b);

    //new 出来的两个 String 是不同对象，引用当然不同，所以得到 false 的结果
    String c = new String("2");
    String d = new String("2");
    assertFalse(c == d);

    //使用 String 提供的 intern 方法也会走常量池机制，所以同样能得到 true
    String e = new String("3").intern();
    String f = new String("3").intern();
    assertTrue( e == f);

    //通过 equals 对值内容判等，是正确的处理方式，当然会得到 true
    String g = new String("4");
    String h = new String("4");
    assertTrue(g.equals(h));
  }
}
