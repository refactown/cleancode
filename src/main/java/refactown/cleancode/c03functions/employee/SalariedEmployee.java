package refactown.cleancode.c03functions.employee;

public class SalariedEmployee extends Employee{

	public SalariedEmployee(String name) {
		super(name, Type.SALARIED);
	}

	@Override
	public double calculatePay() {
		return 3.0;
	}

}
