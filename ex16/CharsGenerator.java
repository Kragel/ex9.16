package t_09_interfaces.ex16;

import java.util.Random;

public class CharsGenerator {
    private static Random rand = new Random(47);

    public char next()
    {
        return (char) rand.nextInt(255);
    }

}
