package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {


	

	private int monthWorkingInYear;
	
	private Personal personal
	
	private Employement Employement;
	
	private Farm family
	
	
	

	
	public Employee(Personal personalInfo, Employment employmentInfo, Family familyInfo) {
		this.personal = personalInfo;
		this.employment = employmentInfo;
		this.family = familyInfo;
	}
	
	
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == employment.getYear()) {
			monthWorkingInYear = date.getMonthValue() -  employment.getMonth();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(employment.getMonthlySalary(), employment.getOtherMonthlyIncome(), monthWorkingInYear, employment.getAnnualDeductible(), family.getSpouseIdNumber().equals(""), family
		.getChildIdNumbers());
	}
}
