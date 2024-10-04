package lotr;

import kicks.ElvenKick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElvenKick());
    }
}