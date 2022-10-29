public class Person {

    private String forename;
    private String surname;
    private String EGN;
    private double balanceBGN;
    public static int countOfPeople;

    private static int getCountOfPeople(){
        return countOfPeople;
    }

    static {
        System.out.println("Block of code");
    }

    public Person(String forename, String surname) {
        System.out.println("Constructor");
        this.forename = forename;
        this.surname = surname;
        countOfPeople++;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public double getBalanceBGN() {
        return balanceBGN;
    }

    public void setBalanceBGN(double balanceBGN) {
        this.balanceBGN = balanceBGN;
    }
}
