package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 2000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

}