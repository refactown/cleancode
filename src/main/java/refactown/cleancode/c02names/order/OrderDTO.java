package refactown.cleancode.c02names.order;

import java.time.LocalDate;
import java.util.List;

public class OrderDTO {
	
	private final String number;
	private final LocalDate date;
	private final List<Item> items;
	
	public OrderDTO(String number, LocalDate date, List<Item> items) {
		super();
		this.number = number;
		this.date = date;
		this.items = items;
	}

	public String getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public List<Item> getItems() {
		return items;
	}

}
