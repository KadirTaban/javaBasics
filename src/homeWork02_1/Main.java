package homeWork02_1;

import homeWork02_1.Abstracts.CampaignSalesManager;
import homeWork02_1.Abstracts.CustomerManager;
import homeWork02_1.Abstracts.GameManager;
import homeWork02_1.Abstracts.NewPrice;
import homeWork02_1.Entities.CampaignSales;
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

        CampaignSales summer = new CampaignSales();

        summer.setCampaignName("Summer discounts");
        summer.setDiscount(0.75);

        double newPrice = summer.getDiscount() * Gta5.getPrice();
        System.out.println(newPrice);
        CampaignSalesManager campaignSalesManager = new CampaignSalesManager() {

            @Override
            public void Save(CampaignSales campaignSales) {

            }
        };


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

            campaignSalesManager.add(summer);
            campaignSalesManager.Save(summer);




        }
}



