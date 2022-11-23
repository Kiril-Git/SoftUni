package test;

public class Lion implements Animal{



    public String getFood(){
        return "meat";
    }

    @Override
    public void speak() {
        System.out.println("I'm The Lion!");
    }


}
