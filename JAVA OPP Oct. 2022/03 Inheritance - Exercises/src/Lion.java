public class Lion extends Animal {


public int biteStrength;




    public void run(){
        System.out.println("Lion is running.");
    }

    public void roar(){
        System.out.println("ROAR");
    }

    public int getBiteStrength() {
        return biteStrength;
    }

    public void setBiteStrength(int biteStrength) {
        this.biteStrength = biteStrength;
    }
    @Override
    public String toString(){
        return "Lion {" + "biteStrength = " + biteStrength + "}";
    }
}
