package com.java.hackerrank.ds;

import java.io.InvalidObjectException;
import java.util.List;

public interface ArrayOperations {

    int[] reverseArray(int[] inputArray);

    List<Integer> reverseArrayList(List<Integer> a);

    int hourglassSum(List<List<Integer>> arr) throws InvalidObjectException;
}
