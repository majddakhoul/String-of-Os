# StringOfOsGame

A simple console-based game called *String of Os* where a user plays against the computer using a Minimax AI algorithm.

---

## Description

This project implements a turn-based game on an `N x N` board. The user and computer take turns placing 'O' on the board. The first player to complete a full row, column, or diagonal of 'O's loses the game. The computer uses a Minimax algorithm with depth-limited search to make decisions.

---

## Features

- **Board Mechanics**:
  - Configurable NxN board (default 3x3)
  - Tracks last move for evaluation
  - Prints board state after every move

- **Game Play**:
  - Human player plays first by entering row and column numbers
  - Computer plays using Minimax AI
  - Alternating turns until a win or draw occurs
  - Detects win based on full row, column, or diagonal

- **AI Mechanics**:
  - Minimax algorithm with `maxMove` and `minMove` functions
  - Depth-limited search (default depth = 3)
  - Evaluates non-terminal states with a heuristic function
  - Chooses moves to maximize its winning chances and minimize user's

- **Classes**:
  - `GamePlay` – Main class handling gameplay loop, user input, and AI moves
  - `State` – Represents the board state, manages moves, checks for loss, generates possible next states
  - `Board_Eval` – Associates a `State` with an evaluation score for Minimax decision-making

- **User Interaction**:
  - Input row and column (1-based index)
  - Board updates are printed to the console
  - Game announces the winner

---

## Installation

1. Clone the repository
2. Open the project in any Java IDE (IntelliJ, Eclipse, NetBeans).
3. Compile all .java files.

---

## How to Run

  - Run the GamePlay.java main method.

---

## How AI Works

The AI uses the Minimax algorithm:

- `maxMove` evaluates the best move for AI
- `minMove` evaluates the worst-case scenario for AI if the user plays optimally
- Each state is evaluated by a heuristic function:
  - `eval(0)` for AI perspective
  - `eval(1)` for user perspective
- Depth-limited search ensures performance while allowing strategic decisions

---

## File Structure

- `GamePlay.java` – Main loop and Minimax AI integration
- `State.java` – Represents board state and move logic
- `Board_Eval.java` – Wrapper for Minimax evaluation

---

## Customization

- **Board Size**: Modify in `State.java` constructor (`State board = new State(3);`)
- **AI Depth**: Adjust `dep` variable in `GamePlay.java` (`private int dep = 3;`)
- **Symbols**: Modify `play()` and `eval()` in `State.java` to change player/AI symbols

---

## Notes

- The AI only considers the last move for win detection.
- Heuristic evaluation rewards the number of `'O'` marks in a row.
- Single human player vs computer AI.
- No automatic draw detection (can be implemented).

---

## Contributions

Contributions are welcome! Fork the project, submit issues, or create pull requests to improve AI logic, add features, or fix bugs.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---
