package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAsk() {

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