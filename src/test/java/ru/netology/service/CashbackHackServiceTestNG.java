package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTestNG {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
            public void testRemainBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(1000), 0); // ожидаеи ошибку из-за дефекта
    }

    @Test
        public void testRemainBelowBoundary() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(999), 1);
    }
}
