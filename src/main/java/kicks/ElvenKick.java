package kicks;

import lotr.Character;

public class ElvenKick implements KickBehavior {
    @Override
    public void kick(Character attacker, Character victim) {
        if (victim.getPower() < attacker.getPower()) {
            victim.setHp(0);
            System.out.println("Elf has killed " + victim.getClass().getSimpleName() + "!");
        } else {
            victim.decreasePower(1);
            System.out.println("Elf has decreased " + victim.getClass().getSimpleName() + "'s power by 1.");
        }
    }
}
