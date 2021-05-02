package inheritance2;

import inheritance.Customer;
import inheritance.CustomerManager;

public class main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());
    }
}
