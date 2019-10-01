package refactown.cleancode.c03functions.employee;

public abstract class Employee {
	
	private String name;
	private Type type;
	
	public Employee(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public abstract double calculatePay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
