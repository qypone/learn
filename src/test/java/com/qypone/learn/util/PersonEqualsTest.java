package com.qypone.learn.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class PersonEqualsTest {

  /**
   * 使用Object的equals
   */
  @Test
  public void test() {
    Person lisi1 = new Person("lisi", 12);
    Person lisi2 = new Person("lisi", 12);

    Assertions.assertFalse(lisi1.equals(lisi2));
    System.out.println(lisi1.hashCode());
    System.out.println(lisi2.hashCode());
    Assertions.assertFalse(lisi1.hashCode() == lisi2.hashCode());
  }

  /**
   * 只重写eauals，只有name参与
   */
  @Test
  public void testRewriteEquals() {
    PersonRewriteEquals lisi1 = new PersonRewriteEquals("lisi", 13);
    PersonRewriteEquals lisi2 = new PersonRewriteEquals("lisi", 12);

    Assertions.assertTrue(lisi1.equals(lisi2));
    System.out.println(lisi1.hashCode());
    System.out.println(lisi2.hashCode());
    Assertions.assertFalse(lisi1.hashCode() == lisi2.hashCode());
  }

  /**
   * 只重写hash，只有name参与
   */
  @Test
  public void testRewriteHash () {
    PersonRewriteHash lisi1 = new PersonRewriteHash("lisi", 13);
    PersonRewriteHash lisi2 = new PersonRewriteHash("lisi", 12);

    Assertions.assertFalse(lisi1.equals(lisi2));
    System.out.println(lisi1.hashCode());
    System.out.println(lisi2.hashCode());
    Assertions.assertTrue(lisi1.hashCode() == lisi2.hashCode());
  }

  /**
   * 重写equals和hash
   */
  @Test
  public void testRewriteEqualsAndHash () {
    PersonRewriteEqualsAndHash lisi1 = new PersonRewriteEqualsAndHash("lisi", 12);
    PersonRewriteEqualsAndHash lisi2 = new PersonRewriteEqualsAndHash("lisi", 12);

    Assertions.assertTrue(lisi1.equals(lisi2));
    System.out.println(lisi1.hashCode());
    System.out.println(lisi2.hashCode());
    Assertions.assertTrue(lisi1.hashCode() == lisi2.hashCode());
  }

  @Test
  public void testRewriteEqualsAndHash2 () {
    PersonRewriteEqualsAndHash lisi1 = new PersonRewriteEqualsAndHash("lisi", 12);
    PersonRewriteEqualsAndHash lisi2 = new PersonRewriteEqualsAndHash("lisi", 12);

    HashMap<PersonRewriteEqualsAndHash, String> map = new HashMap<>();
    map.put(lisi1, "lisi1");
    map.put(lisi2, "lisi2");

    Assertions.assertEquals("lisi2",map.get(lisi1));
    Assertions.assertEquals("lisi2",map.get(lisi2));
  }
}
