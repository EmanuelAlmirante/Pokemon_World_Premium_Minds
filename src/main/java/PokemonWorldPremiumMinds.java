import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonWorldPremiumMinds {

    public static long PokemonsCaught(String input) {

        /*Variables declaration*/
        long pokemonsCaught;
        int startingPositionX = 0;
        int startingPositionY = 0;
        ArrayList<Point> points = new ArrayList<>();

        /*Create starting point*/
        Point startingPosition = new Point(startingPositionX, startingPositionY);
        points.add(startingPosition);
        Point movingPosition = new Point(startingPosition);

        /*Move Ash around the Pokemon world*/
        for(int i = 0; i < input.length(); i++) {
            char move = input.charAt(i);
            char moveUpper = Character.toUpperCase(move);

            /*Only considers valid moves*/
            if(moveUpper == 'N' || moveUpper == 'S' || moveUpper == 'E' || moveUpper == 'O') {
                switch(moveUpper) {
                    case 'N':
                        movingPosition.move(movingPosition.x, movingPosition.y + 1);
                        break;
                    case 'S':
                        movingPosition.move(movingPosition.x, movingPosition.y - 1);
                        break;
                    case 'E':
                        movingPosition.move(movingPosition.x + 1, movingPosition.y);
                        break;
                    case 'O':
                        movingPosition.move(movingPosition.x - 1, movingPosition.y);
                        break;
                }
                /*Add the points where Ash goes through to the list*/
                points.add(new Point(movingPosition));
            }
        }

        /*Count the number of pokemons Ash caught*/
        pokemonsCaught = points.stream().distinct().count();
        return pokemonsCaught;
    }

    public static void main(String args[]) {

        /*Read the input*/
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Pokemons apanhados = " + PokemonsCaught(input));
    }
}
