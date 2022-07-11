package ru.netology.spr;

public class SQRService {

    public int calcCvadr(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sguareRoot = i * i;
            if (sguareRoot >= min) {
                if (sguareRoot <= max) {
                    count ++;

                }
            }
        }
        return  count;
    }

}
