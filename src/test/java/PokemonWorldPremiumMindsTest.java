import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PokemonWorldPremiumMindsTest {

    public String input;
    public long expected;
    public PokemonWorldPremiumMinds pokemonWorldPremiumMinds;

    @Before
    public void initialize() {
        pokemonWorldPremiumMinds = new PokemonWorldPremiumMinds();
    }

    @Parameters(name = "{index}: Input({0}) = {1} pokemon(s) apanhado(s)")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"E", 2},
                {"NESO", 4},
                {"NSNSNSNSNS", 2},
                {"nos", 4},
                {"QWERTYUIOPASDFGHJKLÇZXCVBNM", 3},
                {"qwrtyuipadfghjklçzxcvbm", 1},
                {"eeeeeeeeeeeeeeeeeeeee", 22},
                {"", 1},
                {"nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", 101}
        });
    }

    public PokemonWorldPremiumMindsTest(String input, long expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals(expected, pokemonWorldPremiumMinds.PokemonsCaught(input));
    }
}
