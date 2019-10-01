package refactown.cleancode.c02names.order;

// PROBLEM: Order, Item - SOLUTION: Repository, Mapper, Service, DTO


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String number;
    private LocalDate date;
    private List<Item> items = new ArrayList<Item>();

    public Order (String number, LocalDate date){
        this.number = number;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
