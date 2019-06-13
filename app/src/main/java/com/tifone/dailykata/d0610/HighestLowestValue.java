package com.tifone.dailykata.d0610;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class HighestLowestValue {

    public int[] findHighestLowest(int[] testResource) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int value : testResource) {
            if (lowest > value) {
                lowest = value;
            }
            if (highest < value) {
                highest = value;
            }
        }
        return new int[] {lowest, highest};
    }
    public String findHighestLowest(String numbers) {
        String[] numberArrays = numbers.split(" ");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (String value : numberArrays) {
            int iValue = Integer.valueOf(value);
            if (lowest > iValue) {
                lowest = iValue;
            }
            if (highest < iValue) {
                highest = iValue;
            }
        }
        return highest + " " + lowest;
    }

    public String HighAndLow(String numbers) {
        String[] numberArray = numbers.split(" ");
        int lowest = Arrays.stream(numberArray)
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String value) {
                        return Integer.parseInt(value);
                    }
                })
                .min()
                .getAsInt();
        int highest = Arrays.stream(numberArray)
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String value) {
                        return Integer.parseInt(value);
                    }
                })
                .max()
                .getAsInt();
        return String.format("%d %d", highest, lowest);
    }
}
