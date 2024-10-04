package lotr;

abstract class Character {
    int power;
    int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }
    abstract void kick(Character c);
    public boolean isAlive() {
        return hp > 0;
    }
    public void decreaseHp(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
    }
}