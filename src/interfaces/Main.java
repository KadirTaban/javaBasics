package interfaces;

public class Main {
    //loosly-tightly coupled

    public static void main(String[] args){
        Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer engin = new Customer(1,"Engin","Demiroğ");
        customerManager.add(engin);
    }
}
