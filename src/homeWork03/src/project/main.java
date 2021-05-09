package homeWork03.src.project;

import homeWork03.src.project.business.concretes.UserManager;
import homeWork03.src.project.core.AuthAdapter;
import homeWork03.src.project.dataAccess.concretes.AbcUserDao;
import homeWork03.src.project.entities.concretes.User;

public class main {
    public static void main(String[] args){
        UserManager userManager=new UserManager(new AbcUserDao(),new AuthAdapter()) {

        };

        User user = new User("Kadir","Taban","Kadirtaban@mountainlabs.com","19191a9");
        userManager.add(user);
    }

}

