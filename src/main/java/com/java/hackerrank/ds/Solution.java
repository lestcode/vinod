package com.java.hackerrank.ds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        if (a == null || a.size() <= 1)
            return a;

        return IntStream.range(0, a.size()).mapToObj(i -> a.get(a.size()-i-1)).collect(Collectors.toList());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(new Integer[]{1,4,3,2}));

        List<Integer> res = Result.reverseArray(arr);
        res.forEach(System.out::println);

    }
}
