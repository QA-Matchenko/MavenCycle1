package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrelancerServiceTest {

    @Test
    public void vacationPlan_10000_3000_20000() {
        FrelancerService service = new FrelancerService();
        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void vacationPlan_100000_60000_150000() {
        FrelancerService service = new FrelancerService();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);

    }
}
