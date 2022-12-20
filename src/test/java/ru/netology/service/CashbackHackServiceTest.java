package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 2000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    void calculateBonus2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 200;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}