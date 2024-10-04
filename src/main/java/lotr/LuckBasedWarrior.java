package lotr;

import java.util.Random;
import kicks.LuckBasedKick;

abstract public class LuckBasedWarrior extends Character {
    private static final Random luck = new Random();

    public LuckBasedWarrior(int min, int max) { 
        // max and min refer to both max and min power&hp, 
        // as we don't have any characters that have different 
        // setups of those values
        super(luck.nextInt(max-min) + min, luck.nextInt(max-min) + min, new LuckBasedKick());
    }
}
