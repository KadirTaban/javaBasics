package homeWork02_1.Abstracts;
import homeWork02_1.Entities.Customer;
import homeWork02_1.Services.CustomerService;


public abstract class CustomerManager implements CustomerService  {
        //Her customer geldiğinde customer geldiğine dair feedback verir.
        public void add(Customer customer){
                System.out.println("Customer eklendi."+customer.getFirstName());

        }


}
