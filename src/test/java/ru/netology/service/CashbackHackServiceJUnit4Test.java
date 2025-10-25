package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Callable;

public class CashbackHackServiceJUnit4Test {

@Test
    public void testRemainPositive() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(service.remain(900), 100);
}

@Test
        public void testRemainBoundary() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(service.remain(1000), 0); // ожидаем ошибку из-за дефекта
}

@Test
        public void testRemainBelowBoundary() {
    CashbackHackService service = new CashbackHackService();
     Assert.assertEquals(service.remain(999), 1);
   }
}
