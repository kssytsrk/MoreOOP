package lotr;

class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }

        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " won!");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " won!");
        }
    }
}