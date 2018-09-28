
public class Account {

	private int accountID;
	private String accountType;
	private String userName;
	private String code;
	
	
	public Account(int accountID, String accountType, String userName, String code) {
		this.accountID = accountID;
		this.accountType = accountType;
		this.userName = userName;
		this.code = code;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
