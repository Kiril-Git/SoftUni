package animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favouriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();
}
