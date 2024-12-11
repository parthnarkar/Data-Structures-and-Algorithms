class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        int n = arr.length;
        
        for(int i=1; i<n ; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            
            else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }
        
        return slargest;
    }
}

/* FOR THE SECOND SMALLEST 
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Find the smallest and second smallest elements
        for (int i = 0; i < n; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }
*/
