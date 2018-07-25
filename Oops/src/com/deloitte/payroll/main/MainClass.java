package com.deloitte.payroll.main;

import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.Account;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Interns;

public class MainClass {

	public static void main(String[] args) {
		
		HR emp1= new HR();
		Account account=new Account();
		Employee employee;
		
		employee=emp1.recruit('P');
		account.processSalary(employee);
		
		employee=emp1.recruit('I');
		account.processSalary(employee);
		
		employee=emp1.recruit('C');
		account.processSalary(employee);

		
		
	}

}
