class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] brr = new int[Math.min(arr1.length, arr2.length)];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (k == 0 || brr[k - 1] != arr1[i]) {
                    brr[k] = arr1[i];
                    k++;
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(brr, k);
        
    
    
        
        
    }
}
