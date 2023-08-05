
// GFG problem - https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1


//User function Template for Java

class CyclicallyRotateAnArrayByOne {
    
    public void rotate(int arr[], int n)
    {
        for(int i=0; i<n-1; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
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