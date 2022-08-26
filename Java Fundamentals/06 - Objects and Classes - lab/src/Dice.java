import java.util.Random;
import java.util.Scanner;

public class Dice {
    public int sides;
    public int roll(){

//       Use PascalCase naming !!!
//       Avoid using abbreviations such as URL, HTTP etc.
//       private int sides; -     Field

        Random rnd = new Random();

        int sides = rnd.nextInt(this.sides + 1);

        return sides;

    }
}
