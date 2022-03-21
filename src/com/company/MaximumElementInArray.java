package com.company;

public class MaximumElementInArray {

    public static void main(String args[]){


     //System.out.println(String.valueOf(findLargetsElement()));
        sortArray();


    }

    public static int findLargetsElement(){

        int arr[] = {48, 7, 5, 75, 35, 4, 50};

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void sortArray(){
        int arr[] = {48, 7, 5, 75, 35, 4, 50};

        for(int i=0 ; i < arr.length; i++){

            for (int j = i + 1; j < arr.length ; j++){

                int temp = 0;
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

            System.out.println(arr[i]);

        }


    }
}