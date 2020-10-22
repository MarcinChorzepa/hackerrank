package com.example.hackerrank;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeeksTasks {

    public static int numberOfPointsInCircle(int radius) {
        //we know that we will get at least 4 points at edge of crircle
        int result = 4;

        //a^2 + b^2 = c^2
        //c^2-b^2 = a^2
        for(int i=1;i<radius;i++){
            int square = radius*radius - i*i;
            int y = (int) Math.sqrt(square);

            if(y*y==square){
                result+=4;
            }
        }
        return result;
    }

    public static char firstNonRepeatingChar(String s) {
        char[] countChar = new char[256];
        int index = -1;
        for (int n=0;n<s.length();n++) {
            countChar[s.charAt(n)]++;
        }

        for (int n=0;n<s.length();n++) {
            if(countChar[s.charAt(n)]==1) {
                index = n;
                break;
            }
        }
        return  s.charAt(index);
    }

    public static class FirstDigitSort implements Comparator<String> {
        @Override
        public int compare(String X, String Y) {
            String XY = X + Y;
            String YX = Y + X;
            return XY.compareTo(YX) > 0 ? -1 : 1;
        }
    }
    public static String arrayToGetBiggest(List<String> numbersList) {
        numbersList.sort(new FirstDigitSort());
        StringBuilder sb = new StringBuilder();
        for (String s : numbersList) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String convertNumberToString(long number) {
        Map<Long, String> bigMap = new HashMap<>();
        bigMap.put(1000000000L, "Billion");
        bigMap.put(1000000L, "Million");
        bigMap.put(1000L, "Thousand");


        Map<Long, String> tensMap = new HashMap<>();
        tensMap.put(100L, "Hundred");
        tensMap.put(90L, "Ninety");
        tensMap.put(80L, "Eighty");
        tensMap.put(70L, "Seventy");
        tensMap.put(60L, "Sixty");
        tensMap.put(50L, "Fifty");
        tensMap.put(40L, "Forty");
        tensMap.put(30L, "Thirty");
        tensMap.put(20L, "Twenty");

        Map<Long, String> teensMap = new HashMap<>();
        teensMap.put(19L, "Nineteen");
        teensMap.put(18L, "Eighteen");
        teensMap.put(17L, "Seventeen");
        teensMap.put(16L, "Sixteen");
        teensMap.put(15L, "Fifteen");
        teensMap.put(14L, "Fourteen");
        teensMap.put(13L, "Thirteen");
        teensMap.put(12L, "Twelve");
        teensMap.put(11L, "Eleven");
        teensMap.put(10L, "Ten");


        Map<Long, String> unitsMap = new HashMap<>();
        unitsMap.put(9L, "Nine");
        unitsMap.put(8L, "Eight");
        unitsMap.put(7L, "Seven");
        unitsMap.put(6L, "Six");
        unitsMap.put(5L, "Five");
        unitsMap.put(4L, "Four");
        unitsMap.put(3L, "Three");
        unitsMap.put(2L, "Two");
        unitsMap.put(1L, "One");
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            for (Map.Entry<Long,String> big : bigMap.entrySet()) {
                Long bigValue = number/big.getKey();
                if(bigValue>0) {
                    number -= bigValue*big.getKey();
                    Long hundreds = bigValue/100;

                    if(hundreds>0){
                        number-=hundreds*100;
                        sb.append(unitsMap.get(hundreds));
                        sb.append("Hundred");
                        Long tens = (bigValue-hundreds*100)/10;
                        if(tens>1){
                            number-=tens*10;
                            sb.append(tensMap.get(tens*10));
                            sb.append(unitsMap.get((bigValue-hundreds*100)-tens*10));
                        }else {
                            number-=bigValue-hundreds*100;
                            sb.append(teensMap.get(bigValue-hundreds*100));
                        }
                    }
                    sb.append(big.getValue());
                }
            }
        }
        return sb.toString();
    }
}
