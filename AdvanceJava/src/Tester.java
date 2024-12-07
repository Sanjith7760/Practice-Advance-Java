public class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int accountNumber = 1001;
		double accountBalance = 250000;
		double salary = 40000;
		String loanType = "Car";
		double loanAmountExpected = 300000;
		int emisExpected = 30;
		
		if(accountNumber <1000 || accountNumber > 9999 || String.valueOf(accountNumber).charAt(0) != '1'){
		    System.out.println("Invalid Account Number. It should be 4 digits and starts with 1");
		    return;
		}
		
		if(accountBalance < 1000) {
		    System.out.println("Insufficient Balance.");
		    return;
		}
		
		double eligibleLoanAmount = 0;
		int eligibleEmis =0;
		
		if(salary > 25000 && loanType.equalsIgnoreCase("Car")) {
		    eligibleLoanAmount = 5000000;
		    eligibleEmis = 36;
		}else if(salary > 50000 && loanType.equalsIgnoreCase("House")) {
		    eligibleLoanAmount = 6000000;
		    eligibleEmis = 60;
		}else if (salary > 75000 && loanType.equalsIgnoreCase("Business")) {
		    eligibleLoanAmount = 7500000;
		    eligibleEmis = 84;
		}else {
		    System.out.println("You are not eligible for Loan.");
		}
		
		if(loanAmountExpected <= eligibleLoanAmount && emisExpected <= eligibleEmis) {
		    System.out.println("Account Number: " + accountNumber);
		    System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
		    System.out.println("Eligible EMI's: " + eligibleEmis);
		}else {
		    System.out.println("You are not eligible for loan.");
		}
	}
}

