package testHerd;

public class Cow implements Animal{

private String name;

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.printf("Our cow %s is walking...\n", name);
    }
}
