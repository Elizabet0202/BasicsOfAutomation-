package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTestNG {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));

        Assert.assertEquals(1000, service.remain(1000));
        Assert.assertEquals(1, service.remain(999));
    }
}
