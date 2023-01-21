public class Dish {
    private String name;
    private double price;
    private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0.0;
    }

    public Dish(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
}
