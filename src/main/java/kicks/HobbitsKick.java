package kicks;

import lotr.Character;

public class HobbitsKick implements KickBehavior {
    @Override
    public void kick(Character attacker, Character victim) {
        System.out.println("Hobbit cries!");
    }
}
