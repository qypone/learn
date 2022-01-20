package com.qypone.learn.equals;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TimeUnitTest {

  @Test
  public void test () {
    long l = TimeUnit.SECONDS.toMillis(1);
    System.out.println(l);
  }
}
