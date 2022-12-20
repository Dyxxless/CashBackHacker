package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemained() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    // купил на 1000 ответ 0
    @Test
    public void shouldNotAskToIncrease() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnRemainedInMidOfBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

}