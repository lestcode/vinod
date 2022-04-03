package com.java.hackerrank.ds;

import org.junit.jupiter.api.Test;

import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseArrayImplTest {
    ArrayOperations arrayOperations = new ArrayOperationsImpl();

    @Test
    public void reverseEmptyArray(){
        assertEquals(0, arrayOperations.reverseArray(new int[]{}).length);
    }

    @Test
    public void reverseSingleElementArray(){
        assertEquals(new int[]{1}[0], arrayOperations.reverseArray(new int[]{1})[0]);
    }

    @Test
    public void reverseTwoElementsArray(){
        assertEquals(new int[]{1,2}[0], arrayOperations.reverseArray(new int[]{1,2})[1]);
        assertEquals(new int[]{1,2}[1], arrayOperations.reverseArray(new int[]{1,2})[0]);
    }

    @Test
    public void reverseThreeElementsArray(){
        assertEquals(new int[]{1,2,3}[0], arrayOperations.reverseArray(new int[]{1,2,3})[2]);
        assertEquals(new int[]{1,2,3}[1], arrayOperations.reverseArray(new int[]{1,2,3})[1]);
        assertEquals(new int[]{1,2,3}[2], arrayOperations.reverseArray(new int[]{1,2,3})[0]);
    }

    @Test
    public void reverseEmptyArrayList(){
        assertEquals(0, arrayOperations.reverseArrayList(new ArrayList<>()).size());
    }

    @Test
    public void reverseSingleElementArrayList(){
        assertEquals(1, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1})).get(0).intValue());
    }

    @Test
    public void reverseTwoElementsArrayList(){
        assertEquals(2, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1,2})).get(0).intValue());
        assertEquals(1, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1,2})).get(1).intValue());
    }

    @Test
    public void reverseThreeElementsArrayList(){
        assertEquals(3, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1,2,3})).get(0).intValue());
        assertEquals(2, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1,2,3})).get(1).intValue());
        assertEquals(1, arrayOperations.reverseArrayList(Arrays.asList(new Integer[]{1,2,3})).get(2).intValue());
    }

    @Test
    public void testSingleHourGlassSum() throws InvalidObjectException {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{1,2,3}));
        arr.add(Arrays.asList(new Integer[]{4,5,6}));
        arr.add(Arrays.asList(new Integer[]{7,8,9}));
        assertEquals(35,arrayOperations.hourglassSum(arr));
    }

    @Test
    public void testSingleHourGlassSumReverse() throws InvalidObjectException {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{9,8,7}));
        arr.add(Arrays.asList(new Integer[]{6,5,4}));
        arr.add(Arrays.asList(new Integer[]{3,2,1}));
        assertEquals(35,arrayOperations.hourglassSum(arr));
    }

    @Test
    public void testSingleHourGlassSumAllNines() throws InvalidObjectException {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{9,9,9}));
        arr.add(Arrays.asList(new Integer[]{9,9,9}));
        arr.add(Arrays.asList(new Integer[]{9,9,9}));
        assertEquals(63,arrayOperations.hourglassSum(arr));
    }

    @Test
    public void testMultipleHourGlassSum() throws InvalidObjectException {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{1,2,3,4}));
        arr.add(Arrays.asList(new Integer[]{5,6,7,8}));
        arr.add(Arrays.asList(new Integer[]{9,10,11,12}));
        assertEquals(63,arrayOperations.hourglassSum(arr));
    }
}
