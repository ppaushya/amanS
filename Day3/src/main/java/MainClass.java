public class MainClass {
	Employee[] employees;

	public void accept(int size) {
		employees = new Employee[size];
		for (int i = 0; i < size; i++) {
			employees[i] = new Employee();
			employees[i].getEmployee();
		}
	}
	
	public void print() {
		for (int i = 0; i < employees.length; i++)
			employees[i].printEmployee();
	}

	public static void main(String[] args) {
		MainClass ob = new MainClass();
		ob.accept(3);
		ob.print();
	}
}