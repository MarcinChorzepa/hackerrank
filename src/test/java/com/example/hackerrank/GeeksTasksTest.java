package com.example.hackerrank;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.hackerrank.GeeksTasks.*;

class GeeksTasksTest {


    @Test
    public void circleTest() {
        int x = numberOfPointsInCircle(5);
        Assert.notNull(x);
    }

    @Test
    public void nonRepeatChar() {
        char x = firstNonRepeatingChar("sskok");
        Assert.notNull(x);

    }

    @Test
    public void greaterNumberFromJoiningArrayTest() {
        List<String> list = new ArrayList<>(Arrays.asList("1", "34", "3", "98", "9", "76", "45", "4"));
        String x = arrayToGetBiggest(list);
        long y = 124%10;
        Assert.isTrue(x.equals("998764543431"));
    }

    @Test
    public void convertToLiteralTest() {
        String s = convertNumberToString(8923125455L);
        Assert.notNull(s);

    }


}