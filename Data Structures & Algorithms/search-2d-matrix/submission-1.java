class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean stop = false;
        boolean sol = false;
        int aux = 0;
        int i = 0;
        int r = 0;
        boolean found = false;
        while ( i < matrix.length && !stop){
            aux = matrix[i][matrix[i].length - 1];
            if(aux >= target){stop = true; r = i;}
            i++;
        }
        if(stop){
        int j = 0;
        while(!found && j < matrix[r].length){
        if(matrix[r][j] == target){
            found = true;
        }
        j++;
        }
        }
        return found;
    }
}
