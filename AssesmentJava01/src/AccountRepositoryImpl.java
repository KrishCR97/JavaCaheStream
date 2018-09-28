import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountRepositoryImpl implements IAccountRepository{
	
private static Map<Integer,Account> accountDetails = new HashMap<>();
	
	static {
		
		accountDetails = Collections.unmodifiableMap(IntStream.range(0, 1000).boxed().collect(Collectors.toMap(id -> id, id -> new Account(id, "Savings", "User "+id, id.toString()+"7896"))));
	
	}
	
	@Override
	public Account getAccountByID(int accountID) {
		
		return accountDetails.get(accountID);
		
	}

}
