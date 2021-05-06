package homeWork03.src;

import homeWork03.src.business.concretes.UserManager;
import homeWork03.src.core.GoogleAuthManagerAdapter;
import homeWork03.src.dataAccess.concretes.AbcUserDao;
import homeWork03.src.entities.concretes.User;

public class Main {
    public static void Main(String[] args){
        UserManager userManager=new UserManager(new AbcUserDao() ) {

        });

        User user = new User("Kadir","Taban","Kadirtaban@mountainlabs.com","1919191919");
        userManager.add(user);
    }

}
