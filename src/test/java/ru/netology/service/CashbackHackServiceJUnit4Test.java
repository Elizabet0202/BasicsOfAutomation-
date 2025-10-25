package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceJUnit4Test {

@Test
    public void testRemainPositive() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(100, service.remain(900));
}

@Test
        public void testRemainBoundary() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(0, service.remain(1000)); // упадет, ожидаем 0 вместо 1000
}

@Test
        public void testRemainBelowBoundary() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(1, service.remain(999));
   }
}
