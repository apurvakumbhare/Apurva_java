 class KthLargest {
        int k;
        int[] nums;
        PriorityQueue<Integer> minheap;

        public KthLargest(int k, int[] nums) {
        this.k=k;
        this.nums=nums;
        minheap=new PriorityQueue<>();

            for (int i = 0; i < nums.length; i++) {
                minheap.add(Integer.valueOf(nums[i]));
                if(minheap.size()>k){
                    minheap.poll();
                }
            }
        }

        public int add(int val) {
            minheap.add(val);
              if(minheap.size()>k){
                    minheap.poll();
                }
            return minheap.peek();
        }
    }