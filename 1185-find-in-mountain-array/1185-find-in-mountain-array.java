/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        
        // Check if the target is the peak element
        if (mountainArr.get(peak) == target) {
            return peak;
        }
        
        // Search in the ascending part
        int index = binarySearch(mountainArr, target, 0, peak - 1, true);
        if (index != -1) {
            return index;
        }
        
        // Search in the descending part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int findPeak(MountainArray arr, int n) {
        int s = 0;
        int e = n - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }

    private int binarySearch(MountainArray arr, int target, int s, int e, boolean ascending) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midValue = arr.get(mid);
            
            if (midValue == target) {
                return mid;
            }
            
            if (ascending) {
                if (midValue > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (midValue < target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
