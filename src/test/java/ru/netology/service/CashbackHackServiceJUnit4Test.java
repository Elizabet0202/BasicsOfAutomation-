package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceJUnit4Test {

@Test
    public void testRemain() {
    CashbackHackService service = new CashbackHackService();
    Assert.assertEquals(900, service.remain(100));
    Assert.assertEquals(1000, service.remain(1000));
    Assert.assertEquals(999, service.remain(1));
   }
}
