package service;

import java.util.LinkedList;
import java.util.List;

import model.Balance;
import model.Borrower;
import model.Payment;

public class LedgerService {

	public static List<Payment> payments = new LinkedList<>();
	public static List<Borrower> borrowers = new LinkedList<>();

	static LoanService loan = new LoanService();

	public static void addLoan(String[] tokens) {

		Borrower borrower = new Borrower();

		borrower.setBankName(tokens[1]);
		borrower.setBorrowerName(tokens[2]);
		borrower.setPrincipalAmount(Double.parseDouble(tokens[3]));
		borrower.setNumberOfYears(Integer.parseInt(tokens[4]));
		borrower.setRateOfInterest(Double.parseDouble(tokens[5]));
		borrower.setInterestAmount(loan.calculateInterestAmount(borrower.getPrincipalAmount(),
				borrower.getNumberOfYears(), borrower.getRateOfInterest()));
		borrower.setTotalAmount(loan.calculateTotalAmount(borrower.getPrincipalAmount(), borrower.getInterestAmount()));
		borrower.setNumberOfEmi(loan.calculateNumberOfEmi(borrower.getNumberOfYears()));
		borrower.setAmountPerEmi(loan.calculateAmountPerEmi(borrower.getNumberOfEmi(), borrower.getTotalAmount()));
		borrower.setBalanceAmount(borrower.getTotalAmount());

		borrowers.add(borrower);

	}

	public static void addPayment(String[] tokens) {

		Payment payment = new Payment();

		payment.setBankName(tokens[1]);
		payment.setBorrowerName(tokens[2]);
		payment.setLumpsumAmount(Double.parseDouble(tokens[3]));
		payment.setEmiNumber(Integer.parseInt(tokens[4]));

		payments.add(payment);

	}

	public static void showBalance(String[] tokens) {

		Balance balance = new Balance();
		double amountPaid = 0.0;
		double emiLeft = 0.0;

		balance.setBankName(tokens[1]);
		balance.setBorrowerName(tokens[2]);
		balance.setEmiNumber(Integer.parseInt(tokens[3]));

		for (Borrower borrower : borrowers) {
			if (balance.getBorrowerName().equals(borrower.getBorrowerName())) {
				if (!payments.isEmpty()) {

					for (Payment payment : payments) {
						if (balance.getBorrowerName().equals(payment.getBorrowerName())) {

							if (payment.getEmiNumber() <= balance.getEmiNumber()) {
								amountPaid += borrower.getAmountPerEmi() * balance.getEmiNumber()
										+ payment.getLumpsumAmount();
							} else {
								amountPaid += borrower.getAmountPerEmi() * balance.getEmiNumber();
							}
						}
					}

				} else {
					amountPaid = borrower.getAmountPerEmi() * balance.getEmiNumber();
				}
				emiLeft = Math.ceil((borrower.getTotalAmount() - amountPaid) / borrower.getAmountPerEmi());
			}
		}

		System.out.println(
				balance.getBankName() + " " + balance.getBorrowerName() + " " + (int) amountPaid + " " + (int) emiLeft);

	}

}
