package homeWork02_1.Abstracts;

import homeWork02_1.Entities.Game;
import homeWork02_1.Services.CustomerService;

public abstract class GameManager implements CustomerService {


    public void add(Game game){
            System.out.println("Game eklendi."+game.getName());
    }
}
