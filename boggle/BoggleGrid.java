package boggle;

/**
 * The BoggleGrid represents the grid on which we play Boggle 
 */
public class BoggleGrid {

    /**
     * size of grid
     */  
    private int size;
    /**
     * characters assigned to grid
     */      
    private char[][] board;

    /* BoggleGrid constructor
     * ----------------------
     * @param size  The size of the Boggle grid to initialize
     */
    public BoggleGrid(int size) {
        this.size = size;
        board = new char[size][size];
    }

    /* 
     * Assigns a letter in the string of letters to each grid position
     * Letters should be assigned left to right, top to bottom
     *
     * @param letters a string of letters, one for each grid position.
     */
    public void initalizeBoard(String letters) {
        int row = 0;
        int col = 0;
        int i = 0;
        while(row < this.size && col < this.size){
            board[row][col] = letters.charAt(i);
            col++;
            i++;

            if (col == this.size ) {
                col = 0;
                row++;
            }
            // increment the size of row until its greater than this.size
            // increment the size of col until its greater than this.size
            // at each (row,col) position add the char from 'letters' at i to the position
        }
    }

    /*
     * Provide a nice-looking string representation of the grid,
     * so that the user can easily scan it for words.
     *
     * @return String to print
     */
    @Override
    public String toString() {
        String boardString = "";
        for(int row = 0; row < this.size; row++){
            for(int col = 0; col < this.size; col++){
                boardString += this.board[row][col] + " ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    /*
     * @return int the number of rows on the board
     */
    public int numRows() {
        return this.size;
    }

    /* 
     * @return int the number of columns on the board (assumes square grid)
     */
    public int numCols() {
        return this.size;
    }

    /* 
     * @return char the character at a given grid position
     */
    public char getCharAt(int row, int col) {
        return this.board[row][col];
    }

}
