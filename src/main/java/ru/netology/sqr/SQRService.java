package ru.netology.sqr;

public class SQRService {

    public int calcAmountOfSqrtInRange(int lo , int hi) {
        int count = 0;
        for(int i = 10; i <= 99; i++){
            if (i * i >= lo && i * i <= hi) {
                count++;
            }
        }
        return count;
    }
}

