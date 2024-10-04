package lotr;

class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    void kick(Character c) {
        if (c.power < this.power) {
            c.hp = 0;
            System.out.println("Elf has killed the weaker opponent!");
        } else {
            c.power -= 1;
            System.out.println("Elf has decreased the opponent's power by 1.");
        }
    }
}