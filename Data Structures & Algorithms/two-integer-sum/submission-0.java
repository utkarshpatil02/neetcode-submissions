class Solution {
    public int[] twoSum(int[] nums, int target) {
        // //Brute Force
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             int arr[]={i,j};
        //             return arr;
        //         }
        //     }
        // }
        // return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int j=map.get(target-nums[i]);
                // int arr[]={j,i};
                // return arr;
                return new int[]{j,i};
            }
            map.put(nums[i],i);
            
        }
        return null;
    }
}
