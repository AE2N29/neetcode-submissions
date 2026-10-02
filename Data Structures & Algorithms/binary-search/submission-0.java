class Solution {
    public int search(int[] nums, int target) {
        return searchAux(nums,target,0, nums.length - 1);
    }
    int searchAux(int [] nums, int target, int iO, int iN){
       if(iO == iN){
         if(nums[iO] == target){ return iO;} else { return -1;}
       }
       int k = (iO + iN) / 2;
        if( target == nums[k] ){ return k;} 
        else if(nums[k] < target){
        return searchAux(nums,target, k +1, iN);
        } else { 
        return searchAux(nums,target,iO, k );
        }

    }
}
