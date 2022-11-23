package test;

public class Koala implements Animal{

    public String getFood(){
        return "eucalyptus";
    }

    @Override
    public void speak() {
        System.out.println("I'm a koala");
    }
}
