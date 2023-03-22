public class TicTacToe {
    private char[] board = new char[9];
    private int boxSize = 0;

    public TicTacToe(int boxSize) {
        this.boxSize = boxSize;
        for (int i = 0; i < 9; i++)
            board[i] = ' ';
    }

    public int getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }

    public char getBox(int index) {
        return board[index];
    }

    public void setBox(int index, char symbol) {
        board[index] = symbol;
    }

    public int checkBoard() {
        int checkValue = 0;
        for (int i = 0; i < 9; i += 3) {
            if ((board[i] == 'o') && (board[i + 1] == 'o') && (board[i + 2] == 'o') ||
                    (board[i] == 'x') && (board[i + 1] == 'x') && (board[i + 2] == 'x'))
                checkValue = 1;
        }
        for (int i = 0; i < 3; i++) {
            if (((board[i] == 'o') && (board[i + 3] == 'o') && (board[i + 6] == 'o')) ||
                    ((board[i] == 'x') && (board[i + 3] == 'x') && (board[i + 6] == 'x')))
                checkValue = 1;
        }
        if (((board[0] == 'o') && (board[4] == 'o') && (board[8] == 'o')) ||
                ((board[0] == 'x') && (board[4] == 'x') && (board[8] == 'x')))
            checkValue = 1;

        if (((board[2] == 'o') && (board[4] == 'o') && (board[6] == 'o')) ||
                ((board[2] == 'x') && (board[4] == 'x') && (board[6] == 'x')))
            checkValue = 1;

        return checkValue;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            s.append(String.format("%c|%c|%c\n", board[i], board[i + 1], board[i + 2]));
        }
        return s.toString();
    }

}