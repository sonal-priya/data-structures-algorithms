// GFG Problem Link - https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1

class ValueEqualToIndex {

  ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
    // create an object of ArrayList to add the values and return
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    // run the loop through the array
    for (int i = 0; i < n; i++) {
      // if  value is equal to 1-based array index value, then add the element to the arrayList object
      if (arr[i] == i + 1) {
        arrayList.add(arr[i]);
      }
    }
    // return the arrayList with the added elements
    return arrayList;
  }
}

// Time Complexity = O(N)
