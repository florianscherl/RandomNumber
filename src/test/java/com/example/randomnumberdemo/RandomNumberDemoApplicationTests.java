package com.example.randomnumberdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RandomNumberDemoApplicationTests {
    NumberCalculato calculator = new NumberCalculato();

    @Test
    void numberIsOverNull() {
        int i = calculator.number();
        boolean test = i >= 0 ? true : false;
        assertEquals(true, test);
    }

    @Test
    void numberIsUnderHundred() {
        int i = calculator.number();
        boolean test = i <= 100 ? true : false;
        assertEquals(true, test);
    }

}
