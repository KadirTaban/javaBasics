package homeWork02_1.Abstracts;

import homeWork02_1.Entities.CampaignSales;
import homeWork02_1.Entities.Game;

public class NewPrice extends CampaignSalesManager{

    @Override
    public void Save(CampaignSales campaignSales) {
        System.out.println("kampanyalı fiyat"+campaignSales.getDiscount()* 230);
    }
}
