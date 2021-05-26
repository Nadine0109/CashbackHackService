package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(400);
        int expected = 600;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTestRemainAtTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldTestRemainAboveTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(4999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithOne() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithOneAboveBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithNull() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}