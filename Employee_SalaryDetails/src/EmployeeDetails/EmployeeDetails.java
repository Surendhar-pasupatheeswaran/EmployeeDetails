package EmployeeDetails;

public class EmployeeDetails {
	
	int empID;

	String emp_Name;
	String emp_dept;
	double hra;
	double medicalInsurance;
	double transportAllowance;
	double providentFund;
	double IncomeTax;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getMedicalInsurance() {
		return medicalInsurance;
	}
	public void setMedicalInsurance(double medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}
	public double getTransportAllowance() {
		return transportAllowance;
	}
	public void setTransportAllowance(double transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
	public double getProvidentFund() {
		return providentFund;
	}
	public void setProvidentFund(double providentFund) {
		this.providentFund = providentFund;
	}
	public double getIncomeTax() {
		return IncomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		IncomeTax = incomeTax;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empID=" + empID + ", emp_Name=" + emp_Name + ", emp_dept=" + emp_dept + ", hra=" + hra
				+ ", medicalInsurance=" + medicalInsurance + ", transportAllowance=" + transportAllowance
				+ ", providentFund=" + providentFund + ", IncomeTax=" + IncomeTax + "]";
	}
	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int empID, String emp_Name, String emp_dept, double hra, double medicalInsurance,
			double transportAllowance, double providentFund, double incomeTax) {
		super();
		this.empID = empID;
		this.emp_Name = emp_Name;
		this.emp_dept = emp_dept;
		this.hra = hra;
		this.medicalInsurance = medicalInsurance;
		this.transportAllowance = transportAllowance;
		this.providentFund = providentFund;
		IncomeTax = incomeTax;
	}
	
	
		
	
	
	
}
