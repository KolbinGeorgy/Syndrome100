package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxII() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 4, 8, 11, 1, 3, 9, 9, 2, 4, 10};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}