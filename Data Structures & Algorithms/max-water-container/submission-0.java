class Solution {
    public int maxArea(int[] heights) {
        int maxArea=Integer.MIN_VALUE;
        int lp=0;        //left pointer
        int rp=heights.length-1; //right pointer
        while(lp<rp){
            int minHeight=Math.min(heights[lp],heights[rp]);
            int width=rp-lp;
            int newArea=minHeight*width;
            maxArea=Math.max(maxArea,newArea);
            if(heights[lp]<heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxArea;
    }
}
