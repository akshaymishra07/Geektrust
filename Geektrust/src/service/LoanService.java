package service;

public class LoanService {

	public double calculateInterestAmount(double principalAmount, int numberOfYears, double rateOfInterest) {

		double interestAmount = principalAmount * numberOfYears * (rateOfInterest / 100);

		return Math.ceil(interestAmount);
	}
	
	public double calculateTotalAmount(double principalAmount, double interestAmount) {
		
		return Math.ceil(principalAmount + interestAmount );
		
	}
	
	public int calculateNumberOfEmi(int years) {
		return years * 12;
	}
	
	public double calculateAmountPerEmi(int numberOfEmi , double totalAmount) {
		
		double amountPerEmi = totalAmount / numberOfEmi;
		
		return Math.ceil(amountPerEmi);
		
	}
	
	
}
