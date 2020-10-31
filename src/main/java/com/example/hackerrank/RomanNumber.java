package com.example.hackerrank;

public class RomanNumber {

    public static String integerToRoman(int number){
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i=0;
        String result="";
        while(number>0){
            int multiple = number/val[i];
            number = number - (val[i] * multiple);
            for(int j=0;j<multiple;j++){
                result = result + symbol[i];
            }
            i++;

        }
        return result;
    }
}
