package homeWork;

public class main {
    public static void main(String[]args) {

        Consumer consumer1= new Consumer(1,"JAVA","Engin Demiroğ");
        Consumer consumer2= new Consumer(2,"C#","Engin Demiroğ");


        Consumer[] consumers={consumer1,consumer2};

        for(Consumer consumer: consumers){
            System.out.println(consumer.id);
        }

        ConsumerManager consumerManager = new ConsumerManager();

        consumerManager.joinClass(consumer1);
        consumerManager.joinClass(consumer2);
    }


}
