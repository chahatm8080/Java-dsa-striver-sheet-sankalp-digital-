class singleNumber {
  // Function to find the single element using a hash array
  public int getSingleElement(int[] arr) {
    // int n = arr.length;

    // // Step 1: Find maximum element
    // int maxi = arr[0];
    // for (int i = 0; i < n; i++) {
    // maxi = Math.max(maxi, arr[i]);
    // }

    // // Step 2: Create frequency array of size maxi+1
    // int[] hash = new int[maxi + 1];

    // // Step 3: Count frequencies
    // for (int i = 0; i < n; i++) {
    // hash[arr[i]]++;
    // }

    // // Step 4: Find element with frequency = 1
    // for (int i = 0; i < n; i++) {
    // if (hash[arr[i]] == 1)
    // return arr[i];
    // }

    // return -1; // fallback
    int n = arr.length;
    int xorr = 0;
    for (int i = 0; i < n; i++) {
      xorr ^= arr[i];
    }
    return xorr;
  }
}

class single_number_fromTwice71 {
  public static void main(String[] args) {
    int[] arr = { 4, 1, 2, 1, 2, 5 };
    singleNumber obj = new singleNumber();
    int ans = obj.getSingleElement(arr);
    System.out.println("The single element is: " + ans);
  }
}
