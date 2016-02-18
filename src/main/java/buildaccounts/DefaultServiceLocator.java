package buildaccounts;

/**
 * Created by Administrator on 18/02/2016.
 */
public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();
    private static AccountService accountService = new AccountService();

    public DefaultServiceLocator(){

    }
    public ClientService createClientServiceInstance(){
        return clientService;
    }
    public AccountService createAccountServiceInstance(){
        return accountService;
    }


}
