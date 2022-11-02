package jediGalaxy;

public class Jedi {

    private int row;
    private int col;

    public Jedi(int[] positions) {
        this.row = positions[0];
        this.col = positions[1];
    }

    public int move(Field field) {
        int sumStars = 0;
        while (row >= 0 && col < field.getColLength()) {
            if (field.inBounds(row, col)) {
                sumStars += field.getValue(row, col);
            }

            col++;
            row--;
        }
        return sumStars;
    }
}
