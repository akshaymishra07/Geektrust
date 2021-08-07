package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import service.LedgerService;

public class Geektrust {

	public static void main(String[] args) throws IOException {
		 String filePath = args[0];

		List<String> commandLines = Files.readAllLines(java.nio.file.Paths.get(filePath),
				StandardCharsets.UTF_8);

		for (String command : commandLines) {

			String[] tokens = command.split(" ");

			if (tokens[0].equals("LOAN")) {

				LedgerService.addLoan(tokens);

			} else if (tokens[0].equals("PAYMENT")) {
				LedgerService.addPayment(tokens);

			} else if (tokens[0].equals("BALANCE")) {
				LedgerService.showBalance(tokens);

			}

		}

	}

}
