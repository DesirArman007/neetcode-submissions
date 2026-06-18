class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // checks row duplicates 
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            
            for(int i=0; i<9; i++){
                char ch = board[row][i];
                if( ch == '.') continue;

                if(seen.contains(ch)) return false;

                seen.add(ch);
            }
        }

        // checks col duplicates
        for(int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            
            for(int i=0; i<9; i++){
                char ch = board[i][col];
                if( ch == '.') continue;

                if(seen.contains(ch)) return false;

                seen.add(ch);
            }
        }

        // Check 3 x 3 Matix for duplicates

        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();

            for( int i=0 ; i<3; i++){
                for(int j=0; j<3; j++){
                    
                    int row = (square/3)*3+i;
                    int col = (square/3)*3+j;
                    char ch = board[i][col];
                    if( ch == '.') continue;

                    if(seen.contains(ch)) return false;

                    seen.add(ch);
                }
            }
        }

        return true;
    }
}
