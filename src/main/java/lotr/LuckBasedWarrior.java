package lotr;

import java.util.Random;

public abstract class LuckBasedWarrior extends Character {
    private static final Random luck = new Random();

    public LuckBasedWarrior(int min, int max) { 
        // max and min refer to both max and min power&hp, 
        // as we don't have any characters that have different 
        // setups of those values
        super(luck.nextInt(max-min) + min, luck.nextInt(max-min) + min);
    }

    @Override
    void kick(Character c) {
        int damage = luck.nextInt(this.power + 1);
        c.decreaseHp(damage);
        System.out.println(this.getClass().getSimpleName() + " hits, causing " + damage + " damage.");
    }
}
