package com.example.hackerrank;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Testme {

    public static void findSeqInString(String[] s, int[] seq) {
        List<String> list = Arrays.asList(s);
        for (int n : seq) {
            list = list.stream().filter(x -> x.contains(String.valueOf(n))).collect(Collectors.toList());
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    public static char maxRepeat(String string) {
        int maxCount =0;
        char maxChar = string.charAt(0);
        int start =0 , end=0;
        while (start < string.length()) {
            end = start;
            int cnt = 0;
            while(end<string.length()&&string.charAt(start)==string.charAt(end)){
                if(cnt>maxCount) {
                    maxCount = cnt;
                    maxChar = string.charAt(start);
                }
                cnt++;
                end++;
            }
            start=end;

        }
        return maxChar;
    }

    public static int[] printReverseOrder(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            result[i] = nums[nums.length-i-1];
        }
        return result;
    }

    public static double madian(int[] num1, int[] num2){
        double median = 0;
        int[] arr = IntStream.concat(Arrays.stream(num1),Arrays.stream(num2)).sorted().toArray();
        int mid = arr.length/2;
        if(arr.length%2==0){
            median = ((double) arr[mid]+arr[mid-1])/2;
        }else {
            median = (double) arr[mid];
        }
        return median;
    }


}
//int[] s = IntStream.concat(Arrays.stream(inputMatrix[0]), Arrays.stream(inputMatrix[1])).sorted().toArray();
//Map<Integer, Integer> mapIntegers = IntStream.range(0, arraysIntegers.length).boxed().collect(Collectors.toMap(Function.identity(), x -> arraysIntegers[x]));
//List<Integer> list = Arrays.stream(arrayInt).boxed().collect(Collectors.toList());

//int[] zFromList = list.stream().mapToInt(x->x).toArray();
//int sum = list.stream().mapToInt(Integer::valueOf).sum();
//int sum = Arrays.stream(arrayOfint).sum();

//int[][] resultOfListOfArrays = listOfArrays.toArray(new int[listOfArrays.size()][2])

//Arrays.sort(arraysIntegers);
//Collections.sort(list);

//Arrays.toString(arraysIntegers)
//Deque<String> s = Arrays.stream(name.trim().split(" ")).collect(Collectors.toCollection(ArrayDeque::new))


