class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){ return 0;}
    ArrayList<Integer> numeros = new ArrayList<>();
    Set<Integer> numsaux = new HashSet<>();
    for(int i = 0; i < nums.length; i++ ){
        numsaux.add(nums[i]);
    }
    numeros = new ArrayList<>(numsaux);
    Collections.sort(numeros);
    int max = 1;
    int act = 0;
    int j = 0;
    
    if(numeros.size() > 1){
    while(j < numeros.size()){
        if(j < numeros.size() - 1){
        if((numeros.get(j) + 1 == numeros.get(j + 1))){
        act++;
        if(act >= max ) { max = act;}
        } else if( j != 0 && numeros.get(j -1 ) + 1 == numeros.get(j) ){
            act++;
            if(act >= max ) { max = act;}
            act = 0;
        }
        else{act = 0;}
        } else{
            if(numeros.get(j) - 1 == numeros.get(j - 1 )){
            act++;
            if(act >= max){max = act;}
            }
        }
        j++;
    }
    }
    return max;
    }
}
