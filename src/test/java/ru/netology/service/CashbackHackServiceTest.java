package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testCashbackHackServicePositive() {
        int actual = service.remain(1200);
        int expected = 800;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackHackServiceBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackHackServiceZeroAmount() {
        int actual = service.remain(0);
        int expected = 1000;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testCashbackHackServiceLargeAmount() {
        int actual = service.remain(900_300);
        int expected = 700;
        org.junit.Assert.assertEquals(expected, actual);
    }

}
