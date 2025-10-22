package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTestNG {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));

        Assert.assertEquals(1000, service.remain(1000));
        Assert.assertEquals(1, service.remain(999));
    }
}
