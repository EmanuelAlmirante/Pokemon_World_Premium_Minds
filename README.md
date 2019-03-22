# Pokemon: catch them all

Ash is catching pokemons in a world that consists of a bidimensional grid with an infinite positions. In each position there's a pokemon.

Ash starts by catching the pokemon in the starting position. Next, he moves to the next adjacent position, that can be north, south, east or west of where he is and catches the pokemon in that position, and so on. If Ash passes in a previous position, so a position where he already caught a pokemon, there will be no pokemon in that position.

What we want to know is: starting in a world full of pokemons (one in each position) how many pokemons Ash catches for a determined sequence of movements?

## Input format

The program should read a line from stdin, that contains a sequence of movements. Each movement is described by a letter N, S, E or O (west in portuguese).

## Output format

The program should write one line for the stdout with only the number of pokemons Ash has caught. 

## Examples

| *Input 1* | *Output 1* |
| --------- | ---------- |
| E         | 2          |

| *Input 2* | *Output 2* |
| --------- | ---------- |
| NESO      | 4          |

| *Input 3* | *Output 3* |
| --------- | ---------- |
| NSNSNSNSNS| 2          |
