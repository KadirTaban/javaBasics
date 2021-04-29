package homeWork;

public class Consumer {

    public Consumer() {
        System.out.println("***");

    }

    public Consumer(int id,String category,String investor){
        this();
        this.id=id;
        this.category = category;
        this.investor = investor;
    }
    int id;
    String category;
    String investor;
}
