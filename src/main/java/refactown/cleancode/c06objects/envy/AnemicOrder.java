package refactown.cleancode.c06objects.envy;

import java.time.LocalDate;

public class AnemicOrder {

	private LocalDate date;
	private boolean cancelled;
	
	public AnemicOrder(LocalDate date, boolean cancelled) {
		super();
		this.date = date;
		this.cancelled = cancelled;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
