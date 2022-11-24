package testMammals;

public class Persian implements Cat{


    @Override
    public void breath() {

        System.out.println("Breathing");
    }

    @Override
    public String sleep() {
        return "hrrr";
    }

    @Override
    public int drinkMilk() {
        return 1;
    }
}
