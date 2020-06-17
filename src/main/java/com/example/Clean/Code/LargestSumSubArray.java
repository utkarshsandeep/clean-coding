package com.example.Clean.Code;

/**
 * Explanation: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
class LargestSumSubArray
{
    public static void main (String[] args)
    {
        int [] originalArray = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + calculateLargestSumSubArray(originalArray));
    }

    static int calculateLargestSumSubArray(int inputArray[])
    {
        int previousMax = Integer.MIN_VALUE, lastMax = 0;

        for (int i = 0; i < inputArray.length; i++)
        {
            lastMax = lastMax + inputArray[i];
            if (previousMax < lastMax)
                previousMax = lastMax;
            if (lastMax < 0)
                lastMax = 0;
        }
        return previousMax;
    }
}