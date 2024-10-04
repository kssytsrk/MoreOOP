import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import lotr.*;

public class CharacterTest {

    @Test
    void testHobbitCrying() {
        // Testing hobbit not doing anything aside from crying...
        Hobbit hobbit = new Hobbit();
        Elf elf = new Elf();
        
        hobbit.kick(elf);
        
        assertEquals(10, elf.getHp());
        assertTrue(hobbit.isAlive());
        assertTrue(elf.isAlive());
    }

    @Test
    void testElfKillsWeakerOpponent() {
        // Testing if an elf kills a weaker opponent...
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        
        elf.kick(hobbit);
        
        assertFalse(hobbit.isAlive());
        assertTrue(elf.isAlive());
    }

    @Test
    void testElfWeakensStrongerOpponent() {
        // Testing if an elf weakens a stronger opponent...
        Elf elf = new Elf();
        King king = new King();
        
        king.setPower(elf.getPower() + 1);
        elf.kick(king);
        
        assertEquals(king.getPower(), elf.getPower());
        assertTrue(elf.isAlive());
        assertTrue(king.isAlive());
    }

    @Test
    // generally nothing is said about the damage not potentially
    // being zero, as only "in the range of his power" is specified
    // and his power can be lower than initial settings of 5
    void testKingKicksAndDealsDamage() {
        // Testing if a king deals damage...
        King king = new King();
        Knight knight = new Knight();
        
        int initialHp = knight.getHp();
        king.kick(knight);
        
        assertTrue(knight.getHp() <= initialHp);
        assertTrue(knight.isAlive() || knight.getHp() == 0);
    }

    @Test
    void testKnightKicksAndDealsDamage() {
        // Testing if a knight deals damage...
        Knight knight = new Knight();
        Hobbit hobbit = new Hobbit();
        
        int initialHp = hobbit.getHp();
        knight.kick(hobbit);
        
        assertTrue(hobbit.getHp() <= initialHp); 
        assertTrue(hobbit.isAlive() || hobbit.getHp() == 0);
    }
}