import java.util.*;

public class ValidSudoku {
  public static void main(String[] args) {
    char[][] board = {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    ValidSudoku vs = new ValidSudoku();
    System.out.println(vs.isValidSudoku(board));

  }

  public boolean isValidSudoku(char[][] board) {
    Set<String> seen = new HashSet<>();

    for (int i = 0; i < 9; ++i) {
      for (int j = 0; j < 9; ++j) {
        if (board[i][j] != '.') {
          String b = "(" + board[i][j] + ")";
          if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i / 3 + b + j / 3))
            return false;
        }
      }
    }

    return true;
  }
}
