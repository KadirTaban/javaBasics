package inheritance;

public class Main {
    public static void main(String[] args){
        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber=" 12344  ";
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber=" 353453453  ";
        SendikaCustomer abc = new SendikaCustomer();
        abc.customerNumber="09999 ";




        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {engin,hepsiBurada};

       //customerManager.add(hepsiBurada);
        // customerManager.add(engin);

    }
}
