package testSinger;

public class Main {
    public static void main(String[] args) {


        Singer singer = new OperaSinger();
        singer.sing();

        singer = new RockSinger();
        singer.sing();

        if (singer instanceof  RockSinger) {
            RockSinger singer1 = (RockSinger) singer;
            singer1.rideBike();
        }
            System.out.println("End.");


    }
}
