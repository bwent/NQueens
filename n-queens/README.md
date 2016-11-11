Local Search for N-Queens
----------------------

## Synopsis

This project contains code to test various ways of using local search to solve
the N-queens problem using the MIN-CONFLICTS heuristic. The approaches implemented
include BASIC, GREEDY, RANDOM, and two additional modifications coupled with the
BASIC approach: SMART-START and FIRST-BETTER.


## Installation

**Compiling**: javac *.java from the command line.

**Running**: java NQueensMain [N] [maxSteps] [approach] [tweak]

- N = the dimension of the board.
- maxSteps = number of steps the algorithm takes before giving up.
- approach = {1,2,3}, where 1 = BASIC, 2 = GREEDY, 3 = RANDOM.
- tweak = {1,2}, where 1 = SMART-START, 2 = FIRST-BETTER

**Note**: if no "tweak" parameter is specified, the program defaults to no tweak.

## Code Modifications

    Modifications were made to NQueensClass.java to implement all 5 approaches.

## Tests

10 trials were performed for each of BASIC, GREEDY, and RANDOM for
  N = 10, 50, 100, 250, and 500. The number of steps required to solve the puzzle as
  well as the time taken to solve the puzzle were recorded at each trial.

 Then, using the BASIC approach (which showed bes performance for all problem
  sizes) trials of the same nature  were performed for SMART-START and
  FIRST-BETTER.

## Contributors

	Bridget Went, Erika Sklaver, Amanda Milloy.

## License

    CS 2400: Artificial Intelligence. Fall 2016. Assignment 4.
