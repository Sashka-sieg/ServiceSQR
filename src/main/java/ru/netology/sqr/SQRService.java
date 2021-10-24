package ru.netology.sqr;

public class SQRService {
    public int calculatingSquares(int lowLimit, int highLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= lowLimit && sqr <= highLimit) {
                counter++;
            }
        }
        return counter;
    }
}
