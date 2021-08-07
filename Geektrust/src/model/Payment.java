package model;

public class Payment {

	public String bankName;
	public String borrowerName;
	public double lumpsumAmount;
	public int emiNumber;

	public Payment() {
		super();
	}

	public Payment(String bankName, String borrowerName, double lumpsumAmount, int emiNumber) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
		this.lumpsumAmount = lumpsumAmount;
		this.emiNumber = emiNumber;
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

	public double getLumpsumAmount() {
		return lumpsumAmount;
	}

	public void setLumpsumAmount(double lumpsumAmount) {
		this.lumpsumAmount = lumpsumAmount;
	}

	public int getEmiNumber() {
		return emiNumber;
	}

	public void setEmiNumber(int emiNumber) {
		this.emiNumber = emiNumber;
	}

	@Override
	public String toString() {
		return "Payment [bankName=" + bankName + ", borrowerName=" + borrowerName + ", lumpsumAmount=" + lumpsumAmount
				+ ", emiNumber=" + emiNumber + "]";
	}

}
