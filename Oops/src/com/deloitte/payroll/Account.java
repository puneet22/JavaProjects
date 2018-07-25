package com.deloitte.payroll;

public class Account {

	public void processSalary(Employee employee) {
		if(employee!=null)
		{
			if(employee instanceof ConfirmedEmployee) {
				ConfirmedEmployee confirmedEmployee=(ConfirmedEmployee)employee;
			confirmedEmployee.transportFacility();
			
		}
			
			
			
			employee.netSalary();
		}
	}
}
