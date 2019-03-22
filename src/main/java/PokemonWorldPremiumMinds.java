import java.awt.*;
import java.util.HashSet;
import java.util.Scanner;

public class PokemonWorldPremiumMinds {

    public static long PokemonsCaught(String input) {

        /*Variables declaration*/
        long pokemonsCaught;
        int startingPositionX = 0;
        int startingPositionY = 0;
        HashSet<Point> points = new HashSet<>();

        /*Create starting point*/
        Point position = new Point(startingPositionX, startingPositionY);
        points.add(new Point(position));

        /*Move Ash around the Pokemon world*/
        for(int i = 0; i < input.length(); i++) {
            char move = input.charAt(i);
            char moveUpper = Character.toUpperCase(move);

            /*Only considers valid moves*/
            if(moveUpper == 'N' || moveUpper == 'S' || moveUpper == 'E' || moveUpper == 'O') {
                switch(moveUpper) {
                    case 'N':
                        position.move(position.x, position.y + 1);
                        break;
                    case 'S':
                        position.move(position.x, position.y - 1);
                        break;
                    case 'E':
                        position.move(position.x + 1, position.y);
                        break;
                    case 'O':
                        position.move(position.x - 1, position.y);
                        break;
                }
                /*Add the points where Ash goes through to the list*/
                points.add(new Point(position));
            }
        }

        /*Count the number of pokemons Ash caught*/
        pokemonsCaught = points.size();
        return pokemonsCaught;
    }

    public static void main(String args[]) {

        /*Read the input*/
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(PokemonsCaught(input));
    }
}
