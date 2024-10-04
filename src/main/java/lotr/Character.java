package lotr;

import kicks.KickBehavior;

abstract public class Character {
    protected int power;
    protected int hp;
    protected KickBehavior kick;

    public Character(int power, int hp, KickBehavior kick) {
        this.power = power;
        this.hp = hp;
        this.kick = kick;
    }

    public void kick(Character c) {
        kick.kick(this, c);
    }
    public boolean isAlive() {
        return hp > 0;
    }
    public void decreaseHp(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
    }
    public void decreasePower(int damage) {
        this.power -= damage;
        if (this.power < 0) this.power = 0;
    }

    public int getPower() {
        return power;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int newhp) {
        hp = newhp;
    }
    public void setPower(int newp) {
        power = newp;
    }
}