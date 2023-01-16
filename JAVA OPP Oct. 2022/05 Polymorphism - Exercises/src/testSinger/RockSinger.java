package testSinger;

public class RockSinger implements Singer{

    @Override
    public void sing() {
        System.out.println("Rocking the world !!!");
    }

    public void rideBike() {
        System.out.println("On the two wheels!!!");
    }
}
