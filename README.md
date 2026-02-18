# StringOfOsGame

A simple console-based game called *String of Os* where a user plays against the computer using a Minimax AI algorithm.

## Description

This project implements a turn-based game on an `N x N` board. The user and computer take turns placing 'O' on the board. The first player to complete a full row, column, or diagonal of 'O's loses the game. The computer uses a Minimax algorithm with depth-limited search to make decisions.

## Features

- Console-based gameplay.
- User vs. computer.
- AI uses Minimax with evaluation for optimal moves.
- Customizable board size and search depth.

## How to Play

1. Run the `GamePlay` class.
2. The board will be displayed with rows and columns numbered.
3. Enter the row and column where you want to place your 'O'.
4. The computer will make its move.
5. The game continues until either player loses.

## Classes

- **GamePlay**: Main class that runs the game loop and handles player and computer moves.  
- **State**: Represents the board state and provides methods for move generation, evaluation, and checking loss conditions.  
- **Board_Eval**: Stores a board state with its evaluation value for the Minimax algorithm.

## Requirements

- Java 8 or higher.

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/majddakhoul/String-of-Os.git

2. Compile and run
