package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrThree() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculatingSquares(200, 300);
        assertEquals(expected, actual);

    }

    @Test
    void shouldSqrtwo() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.calculatingSquares(200, 280);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrZero() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculatingSquares(115, 120);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrlNegateNumber() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculatingSquares(-115, 0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrlFour() {
        SQRService service = new SQRService();
        int expected = 4;
        int actual = service.calculatingSquares(1000, 1250);
        assertEquals(expected, actual);
    }
}

