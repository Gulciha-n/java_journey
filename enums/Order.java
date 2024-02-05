package enums;

public class Order {
	
	private int orderId;
	private OrderStatus status;
	
	public Order(int orderId , OrderStatus status ) {
		this.orderId = orderId;
		this.setStatus(status);
	}

	private OrderStatus getStatus() {
		return status;
	}

	private void setStatus(OrderStatus status) {
		this.status = status;
	}
	private String getOrderId() {
		return null;
	}
	
	public static void main(String[] args) {
		
        Order order1 = new Order(1, OrderStatus.NEW);
        System.out.println("Order ID: " + order1.getOrderId());
        System.out.println("Order Status: " + order1.getStatus());

        order1.setStatus(OrderStatus.PROCESSING);
        System.out.println("Updated Order Status: " + order1.getStatus());

        order1.setStatus(OrderStatus.SHIPPED);
        System.out.println("Updated Order Status: " + order1.getStatus());

        order1.setStatus(OrderStatus.DELIVERED);
        System.out.println("Updated Order Status: " + order1.getStatus());

        order1.setStatus(OrderStatus.CANCELED);
        System.out.println("Updated Order Status: " + order1.getStatus());
    }

}
