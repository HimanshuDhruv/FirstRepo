package assignment3;

public class Assignment3 {

	public static void main(String[] args) {
		
		Account account = new Account();
		BankDetail bankDetail = new BankDetail("27625", 150000, "123@Pass");
		
		System.out.print(account.displayAccount(bankDetail));

	}

}





