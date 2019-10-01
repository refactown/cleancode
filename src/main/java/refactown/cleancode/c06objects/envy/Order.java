package refactown.cleancode.c06objects.envy;

import java.time.LocalDate;

public class Order {
	
	private LocalDate date;
	private boolean cancelled;
	
	public Order(LocalDate date, boolean cancelled) {
		super();
		this.date = date;
		this.cancelled = cancelled;
	}

	public boolean isValid() {
		return !cancelled && LocalDate.now().isBefore(date.plusDays(365));
	}
}
