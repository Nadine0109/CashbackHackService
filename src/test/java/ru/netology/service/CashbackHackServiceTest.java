package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(400);
        int expected = 600;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainAtTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldTestRemainAboveTheBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(4999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainWithOne() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainWithNull() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}