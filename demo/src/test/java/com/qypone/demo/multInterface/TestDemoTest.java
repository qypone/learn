package com.qypone.demo.multInterface;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class TestDemoTest {

    @Autowired
    private List<CalcInterface> calcInterfaces;

    @Test
    public void test() {

        for (CalcInterface calcInterface : calcInterfaces) {
            System.out.println(calcInterface);
        }

    }
}