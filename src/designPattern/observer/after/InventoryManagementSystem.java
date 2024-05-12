package designPattern.observer.after;

public class InventoryManagementSystem implements  OrderPlacedSubscriber {

    public InventoryManagementSystem(FlipKart flipKart){
        flipKart.addSubscriber(this);
    }

    public void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory.");
    }


    @Override
    public void onOrderPlaced(Order order) {
        update(order.productId);
    }
}