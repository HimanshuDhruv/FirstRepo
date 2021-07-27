package assignment3;

public class BankDetail {
	private String accountNoString;
	private int accountBalanceLong;
	private String accountPasswordString;
	private static String bankName = "HDFC";
	
	
	public String getAccountNoString() {
		return accountNoString;
	}
	public void setAccountNoString(String accountNoString) {
		this.accountNoString = accountNoString;
	}
	public int getAccountLong() {
		return accountBalanceLong;
	}
	public void setAccountLong(int accountLong) {
		this.accountBalanceLong = accountLong;
	}
	public String getAccountPasswordString() {
		return accountPasswordString;
	}
	public void setAccountPasswordString(String accountPasswordString) {
		this.accountPasswordString = accountPasswordString;
	}
	public static String getBankName() {
		return bankName;
	}
	public static void setBankName(String bankName) {
		BankDetail.bankName = bankName;
	}
	
	public BankDetail(String accountNoString, int accountLong, String accountPasswordString) {
		super();
		this.accountNoString = accountNoString;
		this.accountBalanceLong = accountLong;
		this.accountPasswordString = accountPasswordString;
	}
	@Override
	public String toString() {
		return "Bank Detail [accountNoString=" + accountNoString + ", accountLong=" + accountBalanceLong
				+ ", accountPasswordString=" + accountPasswordString + "] Bank Name"+bankName;
	}
	
	
	

}
