package lotr;

import java.util.List;
import java.util.Random;

public class CharacterFactory {
    private Random random = new Random();

    public Character createCharacter() {
        List<Class<? extends Character>> characterClasses = List.of(Hobbit.class, Elf.class, King.class, Knight.class);
        Class<? extends Character> characterClass = characterClasses.get(random.nextInt(characterClasses.size()));
        try {
            return characterClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}