public enum Courses {

     Basics("Basics", 0, "First course"),
     Fundamentals("Fundamentals", 500, "Second course"),
     Advanced("Advanced", 500, "Third  course");

    private String name;
    private int price;
    private String description;

    Courses(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
