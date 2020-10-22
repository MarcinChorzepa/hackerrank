package com.example.hackerrank;

import java.lang.reflect.GenericDeclaration;

public class SortingExample {


    public static void mergeSort(int[] array, int start, int end)
    {
        if(start<end){
            int mid = (end + start)/2;
            mergeSort(array,start,mid);
            mergeSort(array,mid+1,end);
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start,int mid, int end){
        int lengthL = mid-start + 1;
        int lengthR = end-mid;

        int[] L = new int[lengthL];
        int[] R = new int[lengthR];

        for(int i=0;i<lengthL;i++){
            L[i] = arr[start+ i];
        }
        for(int j=0;j<lengthR;j++){
            R[j]=arr[mid+j+1];
        }

        int i = 0 , j = 0;
        int index = start;
        while(i<lengthL&&j<lengthR){
            if(L[i]<=R[j]){
                arr[index] = L[i];
                i++;
            }else{
                arr[index] = R[j];
                j++;
            }
            index++;
        }

        while(i<lengthL){
            arr[index]=L[i];
            i++;
            index++;
        }
        while(j<lengthR){
            arr[index]=R[j];
            j++;
            index++;
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + (end - start)) / 2;
        while (start < end) {

            if (arr[mid] == value) return mid;
            if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void sortMergeSecond(int[] arr){
        int start = 0;
        int end = arr.length -1;
        sortMergeSecond(arr, start, end);
    }

    private static void sortMergeSecond(int[] arr, int start, int end){
        if(start<end){
            int mid = (start + end) / 2;

            sortMergeSecond(arr, start, mid);
            sortMergeSecond(arr, mid + 1, end);
            mergeSecond(arr, start, mid, end);
        }
    }

    private static void mergeSecond(int[] arr, int start, int mid, int end) {
        int lengthL = mid - start+1;
        int lengthR = end - mid;
        int[] L = new int[lengthL];
        int[] R = new int[lengthR];

        for(int i=0;i<lengthL;i++){
            L[i] = arr[start+i];
        }
        for(int i=0;i<lengthR;i++){
            R[i] = arr[mid+1+i];
        }
        int i = 0 , j = 0;
        int index = start;
        while (i < lengthL && j < lengthR) {
            if(L[i]<=R[j]){
                arr[index++]= L[i];
                i++;
            }else{
                arr[index++] = R[j];
                j++;
            }
        }

        while(i<lengthL){
            arr[index++]=L[i];
            i++;
        }
        while(j<lengthR){
            arr[index++]= R[j];
            j++;
        }

    }


    public static int binarySearchSecond(int[] arr, int value) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = (start + (end - start))/2;
            if(arr[mid]==value) return mid;
            if(arr[mid]<value){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
























 }

