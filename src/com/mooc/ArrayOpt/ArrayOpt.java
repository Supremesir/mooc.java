package com.mooc.ArrayOpt;

public class ArrayOpt {
    int [] array;
    int min_number,min_location;
    double average;
    ArrayOpt(int []array){
        this.array = array;
        min_number = array[0];
        min_location = 1;
    }
    void min() {
        for (int i = 0; i < array.length; i++) {
            if (min_number > array[i]) {
                min_number = array[i];
                min_location = i+1;
            }
        }
    }
    void aver() {
        for (int i:array) {
             average += i;
        }
        average = average/array.length;
    }
}
