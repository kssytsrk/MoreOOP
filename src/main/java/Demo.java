import lotr.CharacterFactory;
import lotr.GameManager;

public class Demo {
    public static void main(String args[]) {
        CharacterFactory cf = new CharacterFactory();
        lotr.Character c1 = cf.createCharacter();
        lotr.Character c2 = cf.createCharacter();
        GameManager g = new GameManager();
        g.fight(c1, c2);
    }
}
