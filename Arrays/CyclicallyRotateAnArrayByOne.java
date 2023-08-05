
// GFG problem - https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1


//User function Template for Java

class CyclicallyRotateAnArrayByOne {
   
   // This method rotates an array of integers by moving the last element to the beginning of the array

public void rotateArray(int[] arr, int length) {
   // The loop runs from the starting index 0 to the second last index of the array
   for(int i = 0; i < length - 1; i++) {
       // Swapping the current element with the last element of the array
       int temp = arr[i];
       arr[i] = arr[length - 1];
       arr[length - 1] = temp;
   }
}
}

/*
* This problem takes in the given array and the size of the array
* Cyclically rotates the array in clockwise direction by one place
* 
* Input:
* N = 5
* A[] = {1, 2, 3, 4, 5}
* Output:
* 5 1 2 3 4
* 
* Solution - Swap the A[n]th element with A[i]th element,
* where 0<i<N-1 and i++
* 
* Time complexity = O(N)
* Auxiliary space complexity = O(1)
* 
*/