package buildaccounts;

/**
 * Created by Administrator on 18/02/2016.
 */
public class ClientService {

    public ClientService() {
    }

    private static ClientService clientService = new ClientService();

    public static ClientService createInstance(){
        return clientService;
    }
    public void printSomething(){
        System.out.println("Something printed from AccountService");
    }

}
