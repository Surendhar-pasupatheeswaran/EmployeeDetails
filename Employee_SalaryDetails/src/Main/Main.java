package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import EmployeeDetails.EmployeeDetails;
import EmployeeDetails.Salary;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		Map <Integer ,EmployeeDetails>map=new HashMap<>();
		
		while(true) {
			System.out.println("\t\t\ttWelcome to Employee Details");
			System.out.println("===================================================================");
			System.out.println("1.Insert  \n 2.Read \n 3.Update\n 4.Delete \n 5.ViewSalary \n 6.Exit ");
			System.out.println("===================================================================");

			System.out.println("Enter the choice");
			int choice =sc.nextInt();

			switch(choice) {
			case 1:
			{
				System.out.println("Enter the necessary details of the employees");
				System.out.print("Enter the Employee ID");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the Employee Name");

				String emp_name=sc.nextLine();
				
				System.out.print("Enter the Employee Department");

				String emp_Dept=sc.nextLine();
				System.out.print("Enter the Employee HRA");

				double hra=sc.nextDouble();
				System.out.print("Enter the Employee Medical Insurance");

				double medicalInsurance=sc.nextDouble();
				System.out.print("Enter the Employee TransportAllowance");

				double transportAllowance=sc.nextDouble();
				System.out.print("Enter the Employee ProvidentFund");

				double providentFund=sc.nextDouble();
				System.out.print("Enter the Employee IncomeTax");

				double IncomeTax=sc.nextDouble();
				EmployeeDetails emp=new EmployeeDetails(id, emp_name, emp_Dept, hra, medicalInsurance, transportAllowance, providentFund, IncomeTax);
				
				map.put(id, emp);
				System.out.print("Employee details inserted successfully !");
				break;	
			}	
			case 2:
			{	System.out.print("Enter the employee to read");
				int readId=sc.nextInt();
				sc.nextLine();
				
				EmployeeDetails employee=map.get(readId);
				if(employee!=null)
						System.out.println(employee);
				else
					System.out.println("Employee not found");
				break;
			}
			case 3:
			{
				System.out.println("Enter Employee Id to update :");
				int updatedId=sc.nextInt();
				EmployeeDetails emp=map.get(updatedId);
				EmployeeDetails emp1=new EmployeeDetails();
				if(emp!=null) {
					
					String name=sc.nextLine();
						emp1.setEmp_Name(name);
					String dept=sc.nextLine();
						emp1.setEmp_dept(dept);
					double hra=sc.nextDouble();
						emp1.setHra(hra);
					double medicalInsurance=sc.nextDouble();
						emp1.setMedicalInsurance(medicalInsurance);
					double transportAllowance=sc.nextDouble();
						emp1.setTransportAllowance(transportAllowance);
					double providentFund=sc.nextDouble();
						emp1.setProvidentFund(providentFund);
					double incomeTax=sc.nextDouble();
						emp1.setIncomeTax(incomeTax);
					System.out.println("Updated Successful");
				}
				else {
					System.out.println("The data is inappropriate");
				}
				
				break;
			}
			case 4:
				{int id =sc.nextInt();
				if(map.remove(id)!=null) {
					System.out.println("Deleted Successfully");
				}
				else {
                    System.out.println("Employee not found.");
                }
				break;}
			case 5:
			{
				int id=sc.nextInt();
				sc.nextLine();
				EmployeeDetails emp = map.get(id);

				
				if(emp!=null) {
				String name=emp.getEmp_Name();
				double totalSalary=emp.getHra()+emp.getMedicalInsurance()+emp.getTransportAllowance()+emp.getProvidentFund()-emp.getIncomeTax();
				System.out.println("Salary of "+name+" is "+totalSalary);}
				break;
			}
			case 6:
				sc.close();
				return;
				
				
		}
	}

	}}
