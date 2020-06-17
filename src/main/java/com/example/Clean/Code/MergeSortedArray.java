package com.example.Clean.Code;

/**
 * Explanation:https://www.geeksforgeeks.org/merge-two-sorted-arrays/
 */

public class MergeSortedArray {
    public static void mergeArrays(int[] firstArray, int[] secondArray,int[] mergeOfArrays)
    {
        int i = 0, j = 0, k = 0;
        while (i<firstArray.length && j <secondArray.length)
        {
            if (firstArray[i] < secondArray[j])
                mergeOfArrays[k++] = firstArray[i++];
            else
                mergeOfArrays[k++] = secondArray[j++];
        }
        while (i < firstArray.length)
            mergeOfArrays[k++] = firstArray[i++];

        while (j < secondArray.length)
            mergeOfArrays[k++] = secondArray[j++];
    }

    public static void main (String[] args)
    {
        int[] firstArray = {1, 3, 5, 7};

        int[] secondArray = {2, 4, 6, 8};

        int[] mergeOfArrays = new int[firstArray.length+secondArray.length];

        mergeArrays(firstArray,secondArray,mergeOfArrays);

        System.out.println("Array after merging");
        for (int i=0; i < firstArray.length+secondArray.length; i++)
            System.out.print(mergeOfArrays[i] + " ");
    }
}
