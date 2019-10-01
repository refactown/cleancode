package refactown.cleancode.c03functions.employee;

public class CommissionedEmployee extends Employee{

	public CommissionedEmployee(String name) {
		super(name, Type.COMMISSIONED);
	}

	@Override
	public double calculatePay() {
		return 1.0;
	}

}
