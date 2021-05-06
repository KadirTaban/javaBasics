package homeWork02_1.Adapters;


import java.rmi.RemoteException;


import Mernis.LWBKPSPublicSoap;
import homeWork02_1.Entities.Customer;
import homeWork02_1.Adapters.CustomerCheckService;

public  class MernisServiceAdapter implements CustomerCheckService {

        @Override
        public boolean CheckIfRealPerson(Customer customer) {
            LWBKPSPublicSoap client= new LWBKPSPublicSoap();
            try {
                return client.TCKimlikNoDogrula(customer.getNationalId(),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDate());
            }
            catch (RemoteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;

        }

    }

