class Application {
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee("001", "EMP001", "Vihanga", "963552777V", "Colombo");
		Employee emp2 = new Employee("002", "EMP002", "Kamal", "972586985V", "Galle");
		
		
		boolean result1 = emp1.equals(emp2);
		System.out.println("1st Result emp1 and emp2 : " + result1);
		
		emp2.setEmpId("001");
		emp2.setEmpNo("EMP001");
		
		boolean result2 = emp1.equals(emp2);
		System.out.println("2st Result emp1 and emp2 : " + result2);
		
		
	}
	
}

class Employee {
	private String empId;
	private String empNo;
	private String name;
	private String nic;
	private String address;
	
	public Employee (String empId, String empNo, String name, String nic, String address) {
		this.empId = empId;
		this.empNo = empNo;
		this.name = name;
		this.nic = nic;
		this.address = address;
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public void setNic(String nic) {
		this.nic = nic;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmpId(){
		return empId;
	}
	
	public String getEmpNo(){
		return empNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNic(){
		return nic;
	}
	
	public String getAddress(){
		return address;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		
		if(emp.empId == this.empId && emp.empNo == this.empNo) {
			return true;
		} else {
			return false;
		}
	}
	
}