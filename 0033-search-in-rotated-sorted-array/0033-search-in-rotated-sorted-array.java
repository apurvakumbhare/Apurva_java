class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If pivot is 0, that means the array is not rotated
        if (pivot == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // If target is in the left sorted part
        if (target >= nums[0] && target <= nums[pivot - 1]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else { // If target is in the right sorted part
            return binarySearch(nums, pivot, nums.length - 1, target);
        }
    }

    // Function to find the index of the smallest element (pivot)
    private int findPivot(int[] nums) {
        int s = 0, e = nums.length - 1;
        
        if (nums[s] < nums[e]) return 0; // If already sorted, return 0

        while (s < e) {
            int mid = s + (e - s) / 2;

            if (mid < e && nums[mid] > nums[mid + 1]) { // Found pivot
                return mid + 1;
            }
            if (mid > s && nums[mid] < nums[mid - 1]) { // Found pivot
                return mid;
            }

            if (nums[mid] >= nums[s]) { // Left side is sorted, move right
                s = mid + 1;
            } else { // Right side is sorted, move left
                e = mid - 1;
            }
        }
        return s; // Pivot index (smallest element)
    }

    // Standard binary search
    private int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
