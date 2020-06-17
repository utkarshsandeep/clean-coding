package com.example.Clean.Code;

public class TrappedRainWater {
        static int findWater(int inputArray[])
        {
            int finalOutput = 0;

            int leftMax = 0, rightMax = 0;

            int low = 0, high = inputArray.length - 1;

            while (low <= high) {
                if (inputArray[low] < inputArray[high]) {
                    if (inputArray[low] > leftMax)

                        leftMax = inputArray[low];
                    else
                        finalOutput += leftMax - inputArray[low];
                    low++;
                }
                else {
                    if (inputArray[high] > rightMax)

                        rightMax = inputArray[high];

                    else
                        finalOutput += rightMax - inputArray[high];
                    high--;
                }
            }

            return finalOutput;
        }


        public static void main(String[] args)
        {
            int inputArray[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

            System.out.println("Maximum water that " + "can be accumulated is "+ findWater(inputArray));
        }
}
