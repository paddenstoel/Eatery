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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
