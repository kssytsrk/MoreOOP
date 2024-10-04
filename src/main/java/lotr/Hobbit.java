package lotr;

class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }
    @Override
    void kick(Character c) {
        System.out.println("Hobbit cries!");
    }
}