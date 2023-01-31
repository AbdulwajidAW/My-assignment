package week2.day1;

public class employeedetails {
	public void printEmployeeName(String empName, int empId) {
		String name= empName + empId;
		System.out.println(name);
	}
	public void getEmployeeAddress(String empAddress) {
		String address= empAddress;
		System.out.println(address);
	}
	public void printEmployeeSalary(double empSalary) {
		double salary=empSalary;
		System.out.println(salary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		long num=mobNum;
		System.out.println(num);
	}
	public static void main(String[] args) {
		employeedetails emp=new employeedetails();
		emp.printEmployeeName("Abdulwajid-", 21360);
		emp.getEmployeeAddress("Vadachennai");
		emp.printEmployeeSalary(150000.500);
		emp.printEmployeeMobileNumber(9551575281l);
	}
	
}
