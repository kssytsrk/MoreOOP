package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight between " + c1.toString() + " and " + c2.toString());
        if (c1.getClass().getSimpleName().equals("Hobbit")
        && c2.getClass().getSimpleName().equals("Hobbit")) {
            System.out.println("Both are hobbits, so they will fight forever.");
            return;
        }
        if (c1.getClass().getSimpleName().equals("Elf")
        && c2.getClass().getSimpleName().equals("Elf")) {
            System.out.println("Both are elves, so they will fight forever.");
            return;
        }
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