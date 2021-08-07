package model;

public class Borrower {

	public String bankName;
	public String borrowerName;
	public double principalAmount;
	public int numberOfYears;
	public double rateOfInterest;
	public double interestAmount;
	public double totalAmount;
	public int numberOfEmi;
	public double amountPerEmi;
	public double balanceAmount;

	public Borrower() {
		super();
	}

	public Borrower(String bankName, String borrowerName, double principalAmount, int numberOfYears,
			double rateOfInterest, double interestAmount, double totalAmount, int numberOfEmi, double amountPerEmi,
			double balanceAmount) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.principalAmount = principalAmount;
		this.numberOfYears = numberOfYears;
		this.rateOfInterest = rateOfInterest;
		this.interestAmount = interestAmount;
		this.totalAmount = totalAmount;
		this.numberOfEmi = numberOfEmi;
		this.amountPerEmi = amountPerEmi;
		this.balanceAmount = balanceAmount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getNumberOfEmi() {
		return numberOfEmi;
	}

	public void setNumberOfEmi(int numberOfEmi) {
		this.numberOfEmi = numberOfEmi;
	}

	public double getAmountPerEmi() {
		return amountPerEmi;
	}

	public void setAmountPerEmi(double amountPerEmi) {
		this.amountPerEmi = amountPerEmi;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "Borrower [bankName=" + bankName + ", borrowerName=" + borrowerName + ", principalAmount="
				+ principalAmount + ", numberOfYears=" + numberOfYears + ", rateOfInterest=" + rateOfInterest
				+ ", interestAmount=" + interestAmount + ", totalAmount=" + totalAmount + ", numberOfEmi=" + numberOfEmi
				+ ", amountPerEmi=" + amountPerEmi + ", balanceAmount=" + balanceAmount + "]";
	}

}
