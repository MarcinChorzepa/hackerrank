package com.example.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

import static com.example.hackerrank.RomanNumber.integerToRoman;

public class NewAttend {

    public static void run() {

        String repeat = "Geegsssaaaaa";
        System.out.println("Max repeating in word " + repeat + " : " + maxRepeatingChar2(repeat));
        findMaxRepChar2(repeat);

        int[] numbersToCount = {1, 1, 1, 1, 3, 3, 3, 8, 8, 8, 8, 8, 8, 8, 2, 2};
        System.out.println("Print out number of times for each number " + Arrays.toString(numbersToCount));
        printOutCountOfNumbers2(numbersToCount);

        String[] arrayOfStrings = new String[]{"123", "415273", "890", "39201"};
        int[] digitsToFind = new int[]{9, 2};
        System.out.println("Find digits " + Arrays.toString(digitsToFind) + " in string " + Arrays.toString(arrayOfStrings));
        findDigitsInString(arrayOfStrings, digitsToFind);

        System.out.println("Find digits any of digits " + Arrays.toString(digitsToFind) + " in string " + Arrays.toString(arrayOfStrings));
        findAnyDigitInString(arrayOfStrings, digitsToFind);

        String charsToRemove = "abbccddcccddddcccddg"; //result should be abbccg
        int n=4;
        System.out.println("Before " + charsToRemove + " n=" + n + " After replecing chars " + removeCharsThatAreAfterEachOther2(charsToRemove, n));

        System.out.println("Reverse of " + Arrays.toString(numbersToCount) + " will be " + Arrays.toString(printReverseOrder2(numbersToCount)));

        int[] arrayTofindMax = new int[]{3, 4, 1, 6, 8, 5,5,6,6,6};
        int nth = 4;
        int maxNumberPos = findKthLargest2(arrayTofindMax, nth);
        System.out.println("Max n-th (" + nth + ") number of array " + Arrays.toString(arrayTofindMax) + " is " + maxNumberPos);
        System.out.println("Max n-th (" + nth + ") number of array " + Arrays.toString(arrayTofindMax) + " is " + findKthLargest3(arrayTofindMax,nth));

        int numberToRoman = 255;
        System.out.println("Integer " + numberToRoman + " in roman number is " + integerToRoman(numberToRoman));

        int peoples = 8;
        int every = 3;
        System.out.println("Josephus number of peoples " + peoples + " kill every " + every + "th , left " + josephus3(peoples,every));

                String[] user1 = new String[]{"mark","1"};
        String[] user2 = new String[]{"mark","5"};
        String[] user3 = new String[]{"susan","4"};
        String[][] usersMarks = new String[][]{user1, user2, user3};
        System.out.println(Arrays.toString(usersMarks)+" Student with the biggest ave : " + bestAverage2(usersMarks));
        String repeatingWord = "dkjookk";
        System.out.println("First non repeatin letter in word " + repeatingWord + " is " + firstNotRepeating(repeatingWord));

        int[] numArr = {1, 54, 4432, 23};
        System.out.println("Form biggest number " + Arrays.toString(numArr) + " will be " + formLargestNumber(numArr));

        List<Cards> cards = new ArrayList<>();
        Cards visa = new Cards("Visa", new int[]{12, 2, 3});
        Cards masterCard = new Cards("MasterCard", new int[]{1, 4, 55});
        cards.add(visa);
        cards.add(masterCard);
        String cardNumber = "12455685548";
        System.out.println("Given cards " + cards.toString() + " and card number " + cardNumber);
        System.out.println("The card number belongs to " + getCardTypeByPrefix(cards, cardNumber));
    }

    private static String getCardTypeByPrefix(List<Cards> cards, String cardNumber) {
        String result = "";
        int currPrefixLength = 0;
        for (Cards card : cards) {
            for (int prefix : card.getPrefix()) {
                int prefixLength = String.valueOf(prefix).length();
                if(cardNumber.startsWith(String.valueOf(prefix))&&prefixLength>currPrefixLength){
                    result = card.getName();
                    currPrefixLength = prefixLength;
                }
            }
        }
        return result;
    }

private static class Cards{
        private String name;
        private int[] prefix;

    public Cards(String name, int[] prefix) {
        this.name=name;
        this.prefix = prefix;
    }

    public String getName() {
        return this.name;
    }

    public int[] getPrefix() {
        return this.prefix;
    }

    @Override
    public String toString() {
        return "Card name " + this.name +
                " Card prefix " + Arrays.toString(this.prefix);
    }
}

    private static String formLargestNumber(int[] arr) {
        List<String> list = Arrays.stream(arr).boxed().map(Object::toString).sorted((o1, o2) -> {
            String xy = o1 + o2;
            String yx = o2 + o1;
            return xy.compareTo(yx) > 0 ? -1 : 1;
        }).collect(Collectors.toList());

        return list.stream().collect(Collectors.joining());
    }

    private static char firstNotRepeating(String word) {
        char result = word.charAt(0);
        for (int i = 0; i < word.length() - 2; i++) {
            if(word.charAt(i)==word.charAt(i+1)) {
                result = word.charAt(i);
                break;
            }
        }

        return result;
    }
    private static String bestAverage2(String[][] usersMarks) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<usersMarks.length; i++){
            List<String> marks = map.getOrDefault(usersMarks[i][0], new ArrayList<>());
            marks.add(usersMarks[i][1]);
            map.put(usersMarks[i][0], marks);
        }
        double maxAvg=0.0;
        String result="";
        for(String student : map.keySet()){
            double sum = map.get(student).stream().mapToInt(Integer::valueOf).sum();
            double avg = (Double) sum / map.get(student).size();
            if(avg>maxAvg){
                maxAvg = avg;
                result = student;
            }
        }
        return result;
    }

    private static int josephus3(int n, int k) {
        List<Integer> peoples = new ArrayList<>();
        for(int i=1;i<=n;i++){
            peoples.add(i);
        }

        int killIndex = 0;
        while(peoples.size()>1){
            killIndex = (killIndex + k-1)%peoples.size();
            peoples.remove(killIndex);
        }
        return peoples.get(0);
    }

    private static int findKthLargest2(int[] array, int n) {
        Arrays.sort(array);
        return array[array.length - n];
    }


    private static int findKthLargest3(int[] array, int n) {
        Arrays.sort(array);
        List<Integer> list = Arrays.stream(array).distinct().boxed().collect(Collectors.toList());
        System.out.println("sorted and unique " + list);
        return  list.get(list.size() - n );
    }

    private static int[] printReverseOrder2(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }

    private static String removeCharsThatAreAfterEachOther2(String strToRemove, int n) {
        int start = 0;
        int end ;
        while (start < strToRemove.length()) {
            end = start;
            int count = 0;
            while (end < strToRemove.length() && strToRemove.charAt(start) == strToRemove.charAt(end)) {
                end++;
                count++;
            }
            if(count>=n){
                strToRemove = strToRemove.substring(0,start) + strToRemove.substring(end);
                start = start - n;
            }else {
                start = end;
            }
        }
        return strToRemove;
    }

    private static void printOutCountOfNumbers2(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int count = countMap.getOrDefault(numbers[i], 0);
            countMap.put(numbers[i], ++count);
        }
        countMap.forEach((key,value)->{
            System.out.println("Number " + key + " has been present " + value + " times");
        });

    }
    private static char maxRepeatingChar2(String word) {
        char[] chars = new char[256];
        for (char c : word.toCharArray()) {
            chars[c]++;
        }
        int index = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++)
            if (chars[i] > max) {
                max = chars[i];
                index = i;
            }
        return (char) index;
    }

    private static void findMaxRepChar2(String word) {
        int start=0;
        int end;
        int max = 0;
        char charMax= word.charAt(0);
        while (start < word.length()) {
            int count=0;
            char tmpChar = word.charAt(start);
            end=start;
            while (end < word.length() && tmpChar == word.charAt(end)) {
                count++;
                end++;
            }
            if (count > max) {
                max=count;
                charMax=tmpChar;
            }
            start=end;
        }
        System.out.println("Char " + charMax + " is repeated " + max + " times");
    }




    private static void findDigitsInString(String[] strings, int[] k) {
        List<String> list = Arrays.asList(strings);
        for (int i : k) {
            list = list.stream().filter(x -> x.contains(String.valueOf(i))).collect(Collectors.toList());
        }
        list.forEach(System.out::println);
    }

    private static void findAnyDigitInString(String[] strings, int[] k) {
        List<String> list = Arrays.asList(strings);
        Set<String> result = new HashSet<>();
        for (int i : k) {
            result.addAll(list.stream().filter(x -> x.contains(String.valueOf(i))).collect(Collectors.toList()));
        }

        result.forEach(System.out::println);
    }
}
