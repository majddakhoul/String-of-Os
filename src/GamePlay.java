
import java.util.List;
import java.util.Scanner;

public class GamePlay {

    State board = new State(3);
    private int dep = 3;

    public void playGame() {
        System.out.println(board);
        while (true) {

            System.out.println("************USER************");
            getUserMove();
            System.out.println(board);

            if (board.lose()) {
                System.out.println("Computer Wins");
                break;
            }

            System.out.println("************Computer************");
            getComputerMove();
            System.out.println(board);

            if (board.lose()) {
                System.out.println("User Wins");
                break;
            }
        }
    }

    private void getUserMove() {
        Scanner s = new Scanner(System.in);
        int row;

        while (true) {
            System.out.print("Enter row: ");
            row = s.nextInt();
            if ((row > 0) && (row < board.getWidth() + 1)) {
                break;
            }
        }

        int col;
        while (true) {
            System.out.print("Enter column: ");
            col = s.nextInt();
            if ((col > 0) && (col < board.getWidth() + 1)) {
                break;
            }
        }

        board.play(row - 1, col - 1);
    }

    public static void main(String[] args) {
        GamePlay g = new GamePlay();
        g.playGame();
    }

    private void getComputerMove() {
        board = new State(maxMove(board, dep).getBoard());
    }

    private Board_Eval maxMove(State b, int dep) {

        if (b.lose()) {
            return new Board_Eval(b, Integer.MAX_VALUE);
        }

        if (dep < 0) {
            return new Board_Eval(b, b.eval(0));
        }

        List<State> nodes = b.get_Next_States();
        Board_Eval best = new Board_Eval(b, Integer.MIN_VALUE);

        for (State n : nodes) {
            Board_Eval e = minMove(n, dep--);
            if (e.getEval() >= best.getEval()) {
                best.setEval(e.getEval());
                best.setBoard(n);
            }
        }

        return best;
    }

    private Board_Eval minMove(State b, int dep) {

        if (b.lose()) {
            return new Board_Eval(b, Integer.MIN_VALUE);
        }

        if (dep < 0) {
            return new Board_Eval(b, b.eval(1));
        }

        List<State> nodes = b.get_Next_States();
        Board_Eval best = new Board_Eval(b, Integer.MAX_VALUE);

        for (State n : nodes) {
            Board_Eval e = maxMove(n, dep--);
            if (e.getEval() <= best.getEval()) {
                best.setEval(e.getEval());
                best.setBoard(n);
            }
        }

        return best;
    }
}

class Board_Eval {

    State Board;
    Integer eval;

    public Board_Eval(State Board, Integer eval) {
        this.Board = Board;
        this.eval = eval;
    }

    public State getBoard() {
        return Board;
    }

    public void setBoard(State Board) {
        this.Board = Board;
    }

    public Integer getEval() {
        return eval;
    }

    public void setEval(Integer eval) {
        this.eval = eval;
    }
}
