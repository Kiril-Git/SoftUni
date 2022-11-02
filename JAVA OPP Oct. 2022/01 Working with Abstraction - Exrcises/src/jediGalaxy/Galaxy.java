package jediGalaxy;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private EvilPow evilPow;

    public Galaxy(Field field, Jedi jedi) {
        this.field = field;
         this.jedi = jedi;
         evilPow = new EvilPow();
    }

    public int jediMove() {
        return jedi.move( field);
    }

    public void evilMove( int rowEvil, int calEvil) {
        evilPow.move(rowEvil, calEvil, field);
    }
}
