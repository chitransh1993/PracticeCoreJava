package com.chitransh;


class SearchElement {

    public static void main (String args[]){
        int[] arr = {-3,-2,0,1,1,11,11,11,11,11,11};
        int ele = 11;
        int[] output = searchLowerAndUpperBound(arr, ele);
    }

    public static int[] searchLowerAndUpperBound(int[] arr, int ele){
        int[] output = {0,0};
        int arrLenght = arr.length;

        if(arrLenght < 2) return output;

        if(ele <= arr[arrLenght/2]) {
            output = binarySearch(arr, ele, 0, arrLenght/2);
        }
        if(ele >= arr[arrLenght/2]) {
            output= binarySearch(arr, ele, arrLenght/2, arrLenght);
        }
        return output;
    }

    public static int[] binarySearch(int[] arr, int ele, int left, int right){
        if((arr[left] == ele) && (left == right)) return left;
        if(ele <= arr[left]) {
            return binarySearch(arr, ele, left, left/2);
        }
        if(ele >= arr[right]) {
            return binarySearch(arr, ele, right/2, right);
        }


    }
//
//    public static int binarySearchRight(int[] arr, int ele, int left, int right){
//        if((arr[left] ==ele) && (left == right)) return left;
//        if(ele <= arr[left]) {
//            return binarySearchLeft(arr, ele, left, left/2);
//        }
//        if(ele >= arr[right]) {
//            return binarySearchRight(arr, ele, right/2, right);
//        }
//    }
}
