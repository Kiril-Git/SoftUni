package hotel;

public enum Season {

//                   4 сезона:
    SUMMER( 4),
    AUTUMN( 1),
    WINTER(3),
    SPRING( 2);

    private  int coefficient;

    Season( int coefficient) {
        this.coefficient = coefficient;
    }


    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
