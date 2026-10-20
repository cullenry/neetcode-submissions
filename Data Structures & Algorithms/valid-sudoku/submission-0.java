class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r =0; r < 9; r++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int c = 0; c < 9; c++){
                char val = board[r][c];
                if(val != '.'){
                    if(rowSet.contains(val)){
                        return false;
                    }
                    rowSet.add(val);
                }
            }
        }

        for(int c =0; c < 9; c++){
            HashSet<Character> colSet = new HashSet<>();
            for(int r=0; r < 9; r++){
                char val = board[r][c];
                if(val != '.'){
                    if(colSet.contains(val)){
                        return false;
                    }
                    colSet.add(val);
                }
            }
        }
        // 3. validate 3x3
        for(int boxRow = 0; boxRow < 9; boxRow+=3){
            for(int boxCol =0; boxCol < 9; boxCol+=3){
                HashSet<Character> boxSet = new HashSet<>();

                // iterate through the 3x3
                for(int r = 0; r < 3; r++){
                    for(int c =0; c < 3; c++){
                        char val = board[boxRow + r][boxCol + c];
                        if(val != '.'){
                            if(boxSet.contains(val)){
                                return false;
                            }
                            boxSet.add(val);
                        }
                    }
                }
            }
        }
        return true;
    }
}
