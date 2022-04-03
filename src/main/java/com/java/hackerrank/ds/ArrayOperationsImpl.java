package com.java.hackerrank.ds;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperationsImpl implements ArrayOperations {


    @Override
    public int[] reverseArray(int[] a) {

        if (a == null || a.length <= 1)
            return a;

        return Arrays.stream(a).map(i ->
                a[a.length - i]).toArray();
    }

    @Override
    public List<Integer> reverseArrayList(List<Integer> a) {
        if (a == null || a.size() <= 1)
            return a;

        return IntStream.range(0, a.size()).mapToObj(i -> a.get(a.size() - i - 1)).collect(Collectors.toList());
    }

    @Override
    public int hourglassSum(List<List<Integer>> arr) throws InvalidObjectException {

        List<List<Integer>> inputArr = new ArrayList<>();

        for(int i=0; i < arr.size(); i++){
            for(int startIndex = 0; startIndex < arr.size()-2; startIndex++){
                inputArr.add(arr.get(i).subList(startIndex, startIndex+3));
            }
        }


        System.out.println(arr.subList(0,1));



        int startCount = 0;
        for(int i=0; i < arr.size(); i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j=0; j < 3; j++){
                innerList.add(arr.get(i).get(j));
            }
            startCount++;
            inputArr.add(innerList);
        }

        return singleHourglassSum(inputArr);
    }


    private int singleHourglassSum(List<List<Integer>> arr) throws InvalidObjectException {
        if(arr.size() != 3){
            throw new InvalidObjectException("Input list size is incorrect expected : 3, actual : "+arr.size());
        } else if (arr.size() == 3 && (arr.get(0).size() != 3
                || arr.get(1).size() != 3
                || arr.get(2).size() != 3)) {
            throw new InvalidObjectException(
                    (arr.get(0).size() != 3 ? ("Input list 1 size is incorrect expected : 3, actual : " + arr.get(0).size()) : "") +
                            (arr.get(1).size() != 3 ? (" and Input list 2 size is incorrect expected : 3, actual : " + arr.get(1).size()) : "") +
                            (arr.get(2).size() != 3 ? (" and Input list 3 size is incorrect expected : 3, actual : " + arr.get(1).size()) : ""));
        }


        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count == 1) {
                sum = sum + arr.get(i).subList(1, arr.get(i).size() - 1).stream().mapToInt(Integer::intValue).sum();
                count++;
            } else {
                sum = sum + arr.get(i).stream().mapToInt(Integer::intValue).sum();
                count++;
            }
        }
        return sum;
    }

}
