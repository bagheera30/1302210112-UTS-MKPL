package lib;

public class TaxFunction {

	
	final int deductibleA = 54000000;
	final int deductibleB = 4500000;
	final int deductibleC = 1500000;
	final double roundable = 0.05;
	
	
	 public static int calculateTax(Employment employment, Farm family,int numberOfMonthWorking){
		
		int tax = 0;
		int numberOfChildren = family.getChildIdNumbers();
		boolean isMarried=family.getSpouseIdNumber() == "";
		int totalMonthly = (employment.getMonthlySalary() + employment.getOtherMonthlyIncome());
		int actualMonthly = employment.getAnnualDeductible() - (deductibleA + deductibleB + (numberOfChildren * deductibleC));
		
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(roundable * ((totalMonthly * numberOfMonthWorking) - actualMonthly));
		}else {
			tax = (int) Math.round(roundable * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - deductibleA));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
