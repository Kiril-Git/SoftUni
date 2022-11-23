package test;

public class Goat implements Animal{

    public String getFood(){
        return "grass";
    }

    @Override
    public void speak() {
        System.out.println("I'm a goat");
    }
}
