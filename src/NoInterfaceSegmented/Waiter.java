package NoInterfaceSegmented;

// Here the waiter is forced to implement those methods which is not required

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // this is not my job
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Food");
    }

    @Override
    public void cookFood() {
        // this is not my job
    }
}
