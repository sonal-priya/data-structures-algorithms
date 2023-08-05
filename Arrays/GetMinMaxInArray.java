// GFG problem link - https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

class GetMinMaxInArray {

  static Pair getMinMax(long a[], long n) {
    // Initialize min and max to the first element of the array
    long min = a[0], max = a[0];

    // Find the minimum value in the array
    for (int i = 1; i < n; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }

    // Find the maximum value in the array
    for (int i = 1; i < n; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }

    // Create a Pair object to store the minimum and maximum values
    Pair pair = new Pair(min, max);

    // Return the Pair object
    return pair;
  }
}
/* Alternatively, we can use the Math library from java to find the min and max values
    long min = a[0], max = a[0];
    for(int i=1; i<n; i++){
      max = Math.max(a[i], max)
      min = Math.min(a[i], min)
    }
    
    this way we can avoid two for loops in the above solution

    Time complexity = O(N) (in both cases, but second one is optimal since one less loop)

*/
