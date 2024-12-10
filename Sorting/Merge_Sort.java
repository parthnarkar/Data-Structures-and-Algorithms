class Solution {

    void mergeSort(int arr[] , int l , int r){
        mS(arr , l , r);
    }
    
    void mS(int arr[], int low, int high) {
        if(low == high) return;
        
        int mid = (low + high) / 2;
        
        mS(arr, low, mid);
        mS(arr, mid + 1 , high);
        
        merge(arr, low , mid , high);
    }
    
    void merge(int arr[] , int low , int mid ,int high){
        
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;
        int right = mid + 1;
        
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }
   
}
