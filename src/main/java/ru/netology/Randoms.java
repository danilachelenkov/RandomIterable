package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int minValue;
    private final int maxValue;
    protected Random random;

    public Randoms(int minValue, int maxValue) {
        if (minValue > maxValue) {
            throw new IllegalArgumentException(String.format("Значение minValue = %s больше значения maxValue = %s", minValue, maxValue));
        }

        this.minValue = minValue;
        this.maxValue = maxValue;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            boolean isNext = true;

            @Override
            public boolean hasNext() {
                if (!isNext) return false;

                return true;
            }

            @Override
            public Integer next() {
                if (minValue == maxValue) isNext = false;

                return random.nextInt(minValue, maxValue + 1);
            }
        };
    }
}
