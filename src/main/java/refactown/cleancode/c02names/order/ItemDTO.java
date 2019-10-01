package refactown.cleancode.c02names.order;

public class ItemDTO {
	
	private final String productId;
	private final int quantity;
	private final double price;
	
	public ItemDTO(String productId, int quantity, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

}
