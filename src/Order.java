public class Order {

    private final static int DEFAULT_DISHES_LENGTH = 16;
    private Dish[] dishes;
    private int numberOfOrderedDishes;

    public Order() {
        this.dishes = new Dish[DEFAULT_DISHES_LENGTH];
    }

    public Order(int arraySize) {
        this.dishes = new Dish[arraySize];
    }

    public Order(Dish[] dishes) {

    }

    public boolean addDishToOrder(Dish dish) {
        for (int i = 0; i < this.dishes.length; i++) {
            if (this.dishes[i] == null) {
                this.dishes[i] = dish;
                return true;
            }
        }

        return false;
    }

    public boolean deleteDishFromOrderByName(String name) {
        for (int i = 0; i < this.dishes.length; i++) {
            if (this.dishes[i].getName().equals(name)) {
                this.dishes[i] = null;
                return true;
            }
        }

        return false;
    }

    public int deleteAllDishesFromOrderByName(String name) {
        int numberOfDeletedDishes = 0;

        for (int i = 0; i < this.dishes.length; i++) {
            if (this.dishes[i].getName().equals(name)) {
                this.dishes[i] = null;
                numberOfDeletedDishes++;
            }
        }

        return numberOfDeletedDishes;
    }
}
