package homeWork02_1;

import homeWork02_1.Abstracts.CustomerManager;
import homeWork02_1.Abstracts.GameManager;
import homeWork02_1.Entities.Customer;
import homeWork02_1.Entities.Game;

public class Main {
    public static void main(String[] args) {
        Customer kadir = new Customer();
        kadir.setId(1);
        kadir.setFirstName("Kadir");
        kadir.setLastName("Taban");


        Game Gta5= new Game();
        Gta5.setName("GTA 5");
        Gta5.setPrice(230);

        GameManager gameManager=new GameManager() {
            @Override
            public void Save(Customer customer) {

            }

            @Override
            public void Save(Game game) {

            }
        };

        CustomerManager customerManager = new CustomerManager() {
            @Override
            public void Save(Customer customer) {

            }

            @Override
            public void Save(Game game) {

            }
        };

            customerManager.add(kadir);
            customerManager.Save(kadir);

            gameManager.add(Gta5);
            gameManager.Save(Gta5);


        }
}



