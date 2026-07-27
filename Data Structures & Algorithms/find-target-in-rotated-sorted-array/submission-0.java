class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            //if target is at mid
            if(nums[mid]==target){
                return mid;
            }
            //case 1 mid lies on L1
            if(nums[si]<=nums[mid]){
                //case a:L1 left part
                if(nums[si]<=target&&target<=nums[mid]){
                    ei=mid-1;
                }else{//case b: mid right part
                    si=mid+1;
                }
            }
            //case 2 mid lies on L2
            else{
                //case c:L2 right part
                if(nums[mid]<=target&&target<=nums[ei]){
                    si=mid+1;
                }else{//case d: mid left part
                    ei=mid-1;
                }
            }
        }
        return -1;
    }

}