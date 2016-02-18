package buildaccounts;

/**
 * Created by Administrator on 18/02/2016.
 */
public class AccountService {

    public AccountService() {
    }

    private static AccountService accountService = new AccountService();

    public static AccountService createInstance(){
        return accountService;
    }
    public void printSomething(){
        System.out.println("Something printed from AccountService");
    }
}
