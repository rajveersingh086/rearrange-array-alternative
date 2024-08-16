package geeks.array;
//company tag (ZOHO)
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
public class rearrange_array_alt {    
        // temp: input array
        // n: size of array
        //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){

         int maxIndex = n - 1, minIndex = 0;
        long maxElem = arr[maxIndex] + 1; // Maximum element + 1, to help with encoding both values
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Encoding the maximum element at the even index
                arr[i] += (arr[maxIndex] % maxElem) * maxElem;
                maxIndex--;
            } else {
                // Encoding the minimum element at the odd index
                arr[i] += (arr[minIndex] % maxElem) * maxElem;
                minIndex++;
            }
        }
        // Decoding the new values to get the final rearranged array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElem;
        }
    }
}

