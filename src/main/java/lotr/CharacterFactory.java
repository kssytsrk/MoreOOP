package lotr;

import java.util.Random;

class CharacterFactory {
    private Random random = new Random();

    public Character createCharacter() {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            default:
                return new Knight();
        }
    }
}