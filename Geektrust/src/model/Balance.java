package model;

public class Balance {

	public String bankName;
	public String borrowerName;
	public int emiNumber;

	public Balance() {
		super();
	}

	public Balance(String bankName, String borrowerName, int emiNumber) {
		super();
		this.bankName = bankName;
		this.borrowerName = borrowerName;
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

	public int getEmiNumber() {
		return emiNumber;
	}

	public void setEmiNumber(int emiNumber) {
		this.emiNumber = emiNumber;
	}

	@Override
	public String toString() {
		return "Balance [bankName=" + bankName + ", borrowerName=" + borrowerName + ", emiNumber=" + emiNumber + "]";
	}

}
