package ru.netology.service;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.service.CashbackHackService;


public class CashbackHackServiceTest {

    @Test
    public void CalculationCashbackWhenOrderingFor900() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CalculationCashbackWhenOrderingFor1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CalculationCashbackWhenOrderingMore1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}