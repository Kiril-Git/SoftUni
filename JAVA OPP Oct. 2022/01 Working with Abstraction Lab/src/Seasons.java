public enum Seasons {

    AUTUMN("Autumn", 16, 123),
    WINTER("Winter", 1, 200),
    SPRING("Spring", 16, 123),
    SUMMER("Summer", 16, 80);

    private String name;
    private  int avTemp ;
    private int mmShowers;

     Seasons(String name, int avTemp, int mmShowers) {
        this.name = name;
        this.avTemp = avTemp;
        this.mmShowers = mmShowers;
    }
}
