package test;

public class Dog extends Mammal{

    public Dog(){
    }




    @Override
    public String toString(){

        return String.format("My dog is called %s, it's %d years old.", name, age);
    }
}
