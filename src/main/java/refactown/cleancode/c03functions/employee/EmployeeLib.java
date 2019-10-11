package refactown.cleancode.c03functions.employee;

public class EmployeeLib {

	public static double calculatePay(Employee employee) {
		switch (employee.getType()) {
		case COMMISSIONED:
			return calculateCommissionedPay(employee);
		case HOURLY:
			return calculateHourlyPay(employee);
		case SALARIED:
			return calculateCommissionedPay(employee);
		default:
			throw new IllegalArgumentException("Unknown type!");
		}	
	}

	public static double calculateSalariedPay(Employee employee) {
		return Double.MIN_VALUE;
	}
	public static double calculateHourlyPay(Employee employee) {
		return Double.POSITIVE_INFINITY;
	}
	public static double calculateCommissionedPay(Employee employee) {
		return Double.MAX_VALUE;
	}

	public static Employee create(String name, Type type) {
		switch (type) {
			case COMMISSIONED:
				return new CommissionedEmployee(name);
			case HOURLY:
				return new HourlyEmployee(name);
			case SALARIED:
				return new CommissionedEmployee(name);
			default:
				throw new IllegalArgumentException("Unknown type!");
		}
	}

}