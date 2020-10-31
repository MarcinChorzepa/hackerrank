package com.example.hackerrank;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.example.hackerrank.NewAttend.run;
import static java.util.Arrays.sort;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

@SpringBootApplication
public class HackerrankApplication {
    public class comparArrays implements Comparator<int[]>{

        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0]==o2[0]?0:o1[0]<o2[0]?-1:1;
        }
    }

    private static void findDigitsInString2(String[] arr, int[] digits) {
        List<String> list = Arrays.asList(arr);
        for (int digit : digits) {
            list = list.stream().filter(x->x.contains(String.valueOf(digit))).collect(toList());
        }
        Collections.sort(list);
        System.out.println("    private static void findDigitsInString2");
        list.forEach(System.out::println);
    }

    private static char maxRepeating(String str) {
        int maxCount=0;
        int i=0;
        int index = 0;
        int end;
        while (i < str.length()) {
            end = i;
            int count =0;
            while(end<str.length()&&str.charAt(i)==str.charAt(end)){
                count++;
                if(count>maxCount) {
                    maxCount=count;
                    index = i;
                }
                end++;
            }
            i=end;
        }
        return str.charAt(index);
    }

    private static void printOutCountOfNumbers(int[] input) {
        int start = 0, end = 0;
        while (start < input.length) {
            end = start;
            int count = 0;
            while (end < input.length && input[start] == input[end]) {
                count++;
                end++;
            }
            System.out.println(input[start]+ " - " + count + " times");
            start=end;
        }
    }

    private static String removeCharsThatAreAfterEachOther(String str, int n) {
        int start = 0 , end = 0;
        String toCalculate =  str;
        while (start < toCalculate.length()) {
            end = start;
            int count=0;
//            String tmpString = "";
            while (end < toCalculate.length()&&toCalculate.charAt(start)==toCalculate.charAt(end)) {
//                tmpString = tmpString + toCalculate.charAt(end);
                count++;
                end++;
            }
            if(count>=n){
                toCalculate = toCalculate.substring(0,start) + toCalculate.substring(end);
                start=start-n+1;
            }else{
                start = end;
            }

        }
        return toCalculate;
    }
    public static void main(String[] args) {

        run();
//        int[] arrToSort = {3,4,2,1};
////        mergeSort(arrToSort,0,arrToSort.length-1);
//        sortMergeSecond(arrToSort);
//        System.out.println(" arrays sorted: " + Arrays.toString(arrToSort));
////        System.out.println(" binary search: " + binarySearch(arrToSort,2));
//        System.out.println(" binary search: " + binarySearchSecond(arrToSort,2));
//
//        String[] arrayOfStrings = new String[]{"123", "415273", "890", "39201"};
//        int[] digitsToFind = new int[]{1, 2, 3};
//        findDigitsInString(arrayOfStrings, digitsToFind);
//        findDigitsInString2(arrayOfStrings,digitsToFind);
//        findSeqInString(arrayOfStrings,digitsToFind);
//
//
//        String repeat = "Geegeeesss";
//        System.out.println("Max repeating: " + maxRepeating(repeat));
//        System.out.println("Max repeat char in " + repeat + " will be " + maxRepeat(repeat));
//
//        int[] numbersToCount = {1, 1, 1, 1, 3, 3, 3, 8, 8, 8, 8, 8, 8, 8, 2, 2};
//        printOutCountOfNumbers(numbersToCount);
//
//        String charsToRemove = "abbccddcdddccddg"; //result should be abbccg
//        int n=4;
//        System.out.println("Before " + charsToRemove + " n=" + n + " After replecing chars " + removeCharsThatAreAfterEachOther(charsToRemove, n));
//
//        System.out.println("Reverse of " + Arrays.toString(numbersToCount) + " will be " + Arrays.toString(printReverseOrder(numbersToCount)));
//
        String seq = "MMMN";
      System.out.println("Print lowest number from sequence "  + seq);
        printLowestNumberFromSeq(seq);
//
//        String repChar = "ccccccchaaarrrr";
//        findMaxRepChar(repChar);
//
//        int[] arrayToreverse = new int[]{1, 2, 3};
//        int[] reversedArray = reverseArray(arrayToreverse);
//        System.out.println(Arrays.toString(reversedArray));
//
//        int[] arrayTofindMax = new int[]{3, 4, 1, 6, 8, 5,5,6,6,6};
//        int maxNumberPos = findKthLargest(arrayTofindMax, 4);
//        System.out.println("Max number position "+ maxNumberPos);
//
//        List<Integer> pascalTriangle = getRow(4);
//        System.out.println("Pascal triangle position " + pascalTriangle);
//        char[] charsToCompress = {'a', 'a', 'a', 'b'};
//        System.out.println("compressed chars "+compressChars(charsToCompress));

//        String stringTOreverse = " Hello     World  ";
//
//        System.out.println("raverse word |" + reverseWords(stringTOreverse)+"|");
//
//        System.out.println("modulo 2%2 " + 2%2);
//        System.out.println("modulo 2%10 " + 2%10);
//        System.out.println("modulo 1%8 " + 1%8);
//        System.out.println("modulo 4%2 " + 4%2);
//        System.out.println("modulo 2%3 " + 2%3);
//        System.out.println("modulo 12%3 " + 12%3);
//        System.out.println("josephus " + josephus(7,3));
//        System.out.println("josephus2 " + josephus2(7,3));
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 2));
//        int[] total = list.stream().mapToInt(x->x).toArray();
//        for(int x:total){
//            System.out.println(x);
//        }
//        int[] nums1 = new int[]{1, 2, 3};
//        int[] nums2 = new int[]{6, 5, 4};
//
//        List<Integer> list2 = new ArrayList();
//        double median = 0.0;
//        list2.addAll(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
//        list2.addAll(Arrays.stream(nums2).boxed().collect(toList()));
//        Collections.sort(list2);
//        modifyStreams();
//        String[] user1 = new String[]{"mark","1"};
//        String[] user2 = new String[]{"mark","5"};
//        String[] user3 = new String[]{"susan","4"};
//        String[][] usersMarks = new String[][]{user1, user2, user3};
//        System.out.println("Student with the biggest ave :" + bestAverage(usersMarks));
//
//        String[] repeatArray = {"mom", "dad", "cat", "cat", "cat", "mom","tree","tree"};
//        System.out.println("nb of repeat k times element: "+ sumOfElementsRepeating(repeatArray,2));
//        System.out.println("nb of repeat k times element2 : "+ sumOfElementsRepeating2(repeatArray,2));
//
//        int[][] inputMatrix = {{0,0,0},{0,1,0},{0,0,0}};
//        //[[0,0,0],[1,1,0],[1,1,0]]
//        System.out.println(shortestPathBinaryMatrix(inputMatrix));

//        String firsApear = "aabgbbcccdfffn";
//        System.out.println("first non repeat char " + firstApearSingleChar(firsApear));
//
//
//        System.out.println("Random generated string : " + randomGenerateString(10));

//        String[] listOfString = {"142563"};
//
//        int[] s = IntStream.concat(Arrays.stream(inputMatrix[0]), Arrays.stream(inputMatrix[1])).sorted().toArray();
//        List<Integer> z  = Arrays.stream(inputMatrix[1]).boxed().collect(toList());
//        int[] zFromList = z.stream().mapToInt(x->x).toArray();
//
//        List<String> inputStrings = new ArrayList<>();
//        inputStrings.add("sdgh");
//        inputStrings.add("gghhhs");
//        inputStrings.add("abc");
//        inputStrings.add("ssggcc");
//        String template = "hsg";
//        System.out.println("Proper string :" + getProperString(inputStrings,template));
    }

    public static Set<String> getProperString(List<String> strings, String template) {
        Set<String> result = new HashSet<>(strings);

        for (char ch : template.toCharArray()) {
            result = result.stream().filter(x->x.contains(String.valueOf(ch))).collect(toSet());
        }

        for (String s : result) {
            for (char ch: s.toCharArray()) {
                if(!template.contains(String.valueOf(ch))){
                    result.remove(s);
                    break;
                }
            }
        }
        return result;
    }

    public static String randomGenerateString(int nbOfChars){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < nbOfChars; i++) {
            int generated = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            sb.append((char) generated);
        }
        return sb.toString();
    }

    public static char firstApearSingleChar(String input){
    int[] single = new int[256];

        for (char n : input.toCharArray()) {
            single[n]++;
        }
        for (int i=0;i<input.length();i++) {
            if(single[input.charAt(i)]==1)return input.charAt(i);
        }
        return (0);
    }



    public static void modifyStreams() {
        List<Integer> listIntegers = new ArrayList<>(Arrays.asList(10,20,30));

        int[] arraysIntegers = listIntegers.stream().mapToInt(x->x).toArray();
        int sum = Arrays.stream(arraysIntegers).sum();
        Map<Integer, Integer> mapIntegers = IntStream.range(0, arraysIntegers.length).boxed().collect(Collectors.toMap(Function.identity(), x -> arraysIntegers[x]));
        for (Map.Entry<Integer, Integer> map : mapIntegers.entrySet()) {
            System.out.println("Key: " + map.getKey() + " Value: " + map.getValue());

        }

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arraysIntegers);

        int[][] resultOfListOfArrays = listOfArrays.toArray(new int[listOfArrays.size()][2]);
        System.out.println("Arrays to int[][] : " + Arrays.deepToString(resultOfListOfArrays));

        sort(arraysIntegers);
        int[] reversePrimitive = new int[arraysIntegers.length];
        for (int i=0;i<arraysIntegers.length/2; i++) {
            int tmp = arraysIntegers[i] ;
            arraysIntegers[i]=arraysIntegers[arraysIntegers.length-i-1];
            arraysIntegers[arraysIntegers.length-i-1]=tmp;
        }
        System.out.println("Reverse array :" + Arrays.toString(arraysIntegers));

        int[] ints = {1,2,3};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println("int[] to List<Integer>" + list);

        String name = " This is my  name";
        Deque<String> s = Arrays.stream(name.trim().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
        for(String deq: s){
            System.out.println("Deq: "+deq);
        }
        Iterator iterator = s.iterator();
        Iterator descIterator = s.descendingIterator();
        while (descIterator.hasNext()){
            System.out.println("Iterate descending :" + descIterator.next());
        }
        while (!s.isEmpty()){

            System.out.println("Pop deq: " + s.pollLast() +" size: "+ s.size());
        }
        System.out.println("Iterate after removing elements");
        while (descIterator.hasNext()){

            System.out.println("Iterate descending :" + descIterator.next());
        }
        while (!s.isEmpty()){
            System.out.println("Chack if emptuy");
        }
        Map<String, Integer> treeMap = new LinkedHashMap<>();
        treeMap.put("2", 20);
        treeMap.put("1", 10);
        treeMap.put("3", 30);
        for (String k : treeMap.keySet()) {
            System.out.println("tree map: " + k);

        }

    }
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;
        for(int i=1; i<=n+1;i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        Map<Integer,Integer> map = new HashMap();
        int i=0;
        ListNode current = head;
        ListNode nextNode = head.next;
        ListNode fast = head.next.next;
        map.put(i,current.val);
        while(current.val!=current.next.val){
            if(current.next==null||nextNode.next==null){
                return false;
            }
            if(fast!=null&&current.val==fast.val){
                current = current.next;
                break;
            }
            i++;
            map.put(i,current.val);
            current = current.next;
            nextNode = nextNode.next;
            fast = fast.next;

        }
        for(int j=i;j>=0;j--){
            current = current.next;
            if(current.val != map.get(j)){
                return false;
            }
        }
    return true;
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0||grid[grid.length-1][grid.length-1]!=0){
            return -1;
        }

        int row ;
        int col ;
        int pathResult =0;
        Map<Integer,Set<Integer>> map = new LinkedHashMap();

        int[][] searchPosition = {{1,1},{1,0},{0,1},{1,-1},{-1,-1},{-1,0},{-1,1},{0,-1}};
        int r = 0;
        int c = 0;
            while(c<grid[r].length&&r<grid.length){
                Set<Integer> listOfCollumns = map.getOrDefault(r , new HashSet<>());
                listOfCollumns.add(c);
                map.put(r, listOfCollumns);
                if(c==grid.length-1&&r==grid.length-1) break;
                for(int i=0;i<searchPosition.length;i++){
                    row = searchPosition[i][0];
                    col = searchPosition[i][1];
                    if(r+row<0 || c+col<0 || r+row> grid.length-1|| c+col>grid.length-1){
                        continue;
                    }
                    if(grid[r+row][c+col]==0){
                        r +=row;
                        c +=col;
                        break;
                    }
                }


            }

        for(Set<Integer> set: map.values()){
            pathResult+=set.size();
        }
        return pathResult;
    }

    static int josephus2(int n, int k){
        List<Integer> peoples = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            peoples.add(i);
        }

        int killIndex =0;
        while(peoples.size()>1){
            killIndex = (killIndex + k-1)%peoples.size();
            peoples.remove(killIndex);
        }
        return peoples.get(0);
    }

    static int  josephus(int n, int k)
    {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k-1) % n + 1;
    }

        public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] stringArr = s.trim().split(" ");
        int length = stringArr.length;
        for(int i = length-1;i>=0;i--){
            if(stringArr[i].equals("")) continue;
                sb.append(stringArr[i]);
                if(i>0){
                    sb.append(" ");
                }
        }
        return sb.toString();
    }


    public static int compressChars(char[] chars) {

        Map<Character, String> map = new HashMap<>();
        for (char c : chars) {
            if (!map.containsKey(c)) {
                map.put(c, "1");
            }else{
                map.replace(c,String.valueOf(Integer.parseInt(map.get(c)) + 1));
            }
        }
        List<Character> result = mapToCharList(map);
        return result.size();
    }

    private static List<Character> mapToCharList(Map<Character, String> map) {
        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, String> element : map.entrySet()) {
            result.add(element.getKey());
            result.add(element.getValue().charAt(0));
        }
        return result;
    }


    public static List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList();
        if(rowIndex==0){
            currentRow.add(1);
            return currentRow;
        }

        currentRow.add(1);

        List<Integer> prevRow = getRow(rowIndex-1);
        for(int i=1;i<rowIndex;i++){
            currentRow.add(prevRow.get(i-1)+prevRow.get(i));
        }
        currentRow.add(1);

        return currentRow;
    }


    public static int findKthLargest(int[] nums, int k) {
        sort(nums);
        return nums[nums.length - k];
    }

    private static int[] reverseArray(int[] arrayToreverse) {
        int length = arrayToreverse.length;
        int[] result = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            result[length - i - 1] = arrayToreverse[i];
        }
        return result;
    }

    private static void findMaxRepChar(String repChar) {
        int length = repChar.length();
        int maxNbOfrep = 1;
        int nbOfRepetition = 1;
        char searchChar = 0;
        for (int i = 0; i < length-1; i++) {
            if (repChar.charAt(i) == repChar.charAt(i + 1)) {
                nbOfRepetition++;
                if (maxNbOfrep < nbOfRepetition) {
                    searchChar = repChar.charAt(i);
                }
                maxNbOfrep = Math.max(maxNbOfrep, nbOfRepetition);
            }else {
                nbOfRepetition = 1;
            }
        }
        System.out.println(searchChar);

    }




    private static void printLowestNumberFromSeq(String seq) {
        int m=0;
        int n=0;
        int i = 0;
        int length = seq.length();
        int[] result = new int[length];
        for (char x : seq.toCharArray()) {

            if (x=='M') {
                m++;
                result[i]=m;
            }else {
                m--;
                result[i] =m;
            }
            i++;
        }
        String strOfInts = Arrays
                .stream(result)
                .mapToObj(String::valueOf)
                .reduce((a, b) -> a.concat(b))
                .get();
        System.out.println(strOfInts);


    }


    private static void findDigitsInString(String[] arrayOfStrings, int[] digitsToFind) {
        List<String> list = Arrays.asList(arrayOfStrings);
        for (int i : digitsToFind) {
           list = list.stream().filter(x -> x.contains(Integer.toString(i))).collect(Collectors.toList());
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    public static boolean isPalindrome2(ListNode head) {
        if(head == null) return true;
        ListNode fast = head, slow = head;

        /** find middle element */
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        /** reverse the second half */
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        /** compare the first and second half */
        slow = prev;
        while(slow != null) {
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    public List<Integer> getRow2(int rowIndex) {

        int[][] result = new int[rowIndex+1][rowIndex+1];

        result[0][0]=1;

        for(int i=1;i<rowIndex+1;i++){
            result[i][0] = 1;

            for(int j=1;j<i;j++){
                result[i][j] = result[i-1][j-1]+result[i-1][j];
            }
            result[i][i] = 1;
        }

        List<Integer> sol = new ArrayList();
        for(int n: result[rowIndex]){
            sol.add(n);
        }
        return sol;
    }

    public static String bestAverage(String[][] marks){
        /*[[mark,2],[mark, 3],[susan, 5]]*/
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<marks.length;i++){
                List<String> list = map.getOrDefault(marks[i][0], new ArrayList<>());
                list.add(marks[i][1]);
                map.put(marks[i][0],list);
        }

        double avg = 0.0;
        String result= new String();
        for(String user: map.keySet()){
            int size = map.get(user).size();
            int sum = map.get(user).stream().mapToInt(Integer::valueOf).sum();
            double avgTmp = (double) sum / (double) size;
            if(avgTmp>avg){
                avg = avgTmp;
                result = user;
            }
        }
        return result;
    }

    public static int sumOfElementsRepeating(String[] arr, int repeatTimes){
//        ["mom","dad","cat","cat","cat","mom"]
        Map<String,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            int sum = map.getOrDefault(arr[i], 0);
            map.put(arr[i],sum+1);
        }
        int result = 0;
        for(int val:map.values()){
            if(val==repeatTimes) result++;
        }
        return result;
    }

    public static int sumOfElementsRepeating2(String[] arr, int repeatTimes){
        Map<Integer, List<String>> map = new HashMap<>();
        List<String> list = Arrays.asList(arr);

       int result =0;
        for(String s: list){
            int count = (int) list.stream().filter(x->x.contains(s)).count();
            if(count==repeatTimes)result++;
            list = list.stream().filter(x->!x.contains(s)).collect(toList());
        }
        return result;

    }




}
