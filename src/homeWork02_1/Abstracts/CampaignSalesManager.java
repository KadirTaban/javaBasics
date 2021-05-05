package homeWork02_1.Abstracts;

import homeWork02_1.Entities.CampaignSales;
import homeWork02_1.Services.CampaignServices;

public abstract class CampaignSalesManager implements CampaignServices {
        public void add(CampaignSales campaignSales){
                System.out.println(campaignSales.getDiscount()+"Kampanya eklendi");
    }


}
