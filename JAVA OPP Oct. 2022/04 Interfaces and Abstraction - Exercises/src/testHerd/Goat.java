package testHerd;

public class Goat implements Animal, Swimmer{

    private String name;

    public Goat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.printf("Our goat %s is walking...\n", name);
    }

    @Override
    public void swim() {
        System.out.printf("Our goat %s can swim too ... wow.\n", name);
    }
}
