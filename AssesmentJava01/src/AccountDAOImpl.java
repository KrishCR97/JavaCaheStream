import java.util.HashMap;
import java.util.Map;

public class AccountDAOImpl implements IAccountDAO{
	
	private static Map<Integer,Account> cachedAccounts = new HashMap<>();
	AccountRepositoryImpl accountRepo = new AccountRepositoryImpl();

	@Override
	public synchronized Account getAccountByID(int accountID) {
		
		if(cachedAccounts.containsKey(accountID)) {
			
			return cachedAccounts.get(accountID);
			
		}
		
		Account account = accountRepo.getAccountByID(accountID);
		
		cachedAccounts.put(accountID, account);
		
		return account;
	}

	

}
