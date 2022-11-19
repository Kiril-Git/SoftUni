public class Animal {

    protected String name;
    protected int age;




    public void run(){
        System.out.println("Animal is running.");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
