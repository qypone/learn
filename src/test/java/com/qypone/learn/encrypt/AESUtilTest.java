package com.qypone.learn.encrypt;

import org.junit.jupiter.api.Test;

public class AESUtilTest {
  @Test
  public void aes() {
    String origin = "Xinfeng@831208";
    String encrypt = AESUtil.encrypt(origin, AESUtil.getAssetsDevPwdField());
    System.out.println(encrypt);
    String decrypt = AESUtil.decrypt("igU9LqbABzlXN0OQkqz/Hw==", AESUtil.getAssetsDevPwdField());
    System.out.println(decrypt);
//    assertNotNull(encrypt);
//    assertEquals(origin, decrypt);
  }

}