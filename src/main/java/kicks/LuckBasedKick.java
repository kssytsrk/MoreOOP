package kicks;

import java.util.Random;

import lotr.Character;

public class LuckBasedKick implements KickBehavior {
    private static final Random luck = new Random();

    @Override
    public void kick(Character attacker, Character victim) {
        int damage = luck.nextInt(attacker.getPower() + 1);
        victim.decreaseHp(damage);
        System.out.println(attacker.getClass().getSimpleName() + " hits, causing " + damage + " damage.");
    }
}
