package com.example.Clean.Code;

/**
 * Explanation:https://www.geeksforgeeks.org/leaders-in-an-array/
 */
class LeadersInArray
{
    void displayLeaders(int inputArray[])
    {
        for (int i = 0; i < inputArray.length; i++)
        {
            int j;
            for (j = i + 1; j < inputArray.length; j++)
            {
                if (inputArray[i] <= inputArray[j])
                    break;
            }
            if (j == inputArray.length)
                System.out.print(inputArray[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        LeadersInArray lead = new LeadersInArray();
        int inputArray[] = new int[]{16, 17, 4, 3, 5, 2};
        lead.displayLeaders(inputArray);
    }
}