package homeWork02_1.Entities;

public class Game {

    private int price;
    private String name;

    public Game(){

    }

    public Game(int price, String name){
        this.price=price;
        this.name=name;

    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
