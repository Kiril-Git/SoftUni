package jediGalaxy;

public class EvilPow {

    public void move(int rowEvil, int calEvil, Field field) {
        while (rowEvil >= 0 && calEvil >= 0) {
            if (field.inBounds(rowEvil, calEvil)) {
                field.setValue(rowEvil, calEvil, 0);
            }
            rowEvil--;
            calEvil--;
        }
    }
}
