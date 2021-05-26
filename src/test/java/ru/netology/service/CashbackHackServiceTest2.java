package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CashbackHackServiceTest2 {

    @Test
    public void shouldTestRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(400);
        int expected = 600;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestRemainAtTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestRemainAboveTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(4999);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithOne() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithOneAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithNull() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);
    }
}