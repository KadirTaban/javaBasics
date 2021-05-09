package homeWork03.src.project;

import homeWork03.src.project.business.abstracts.UserService;
import homeWork03.src.project.business.concretes.UserManager;
import homeWork03.src.project.core.AuthAdapter;
import homeWork03.src.project.core.abstracts.EmailConfirmService;
import homeWork03.src.project.core.concrete.EmailConfirmManager;
import homeWork03.src.project.dataAccess.concretes.AbcUserDao;
import homeWork03.src.project.entities.concretes.User;

public class main {
    public static void main(String[] args){
        UserService userService=new UserManager(new AbcUserDao(), new AuthAdapter(), new EmailConfirmManager()) {


        };

        User user = new User(" Kadir"," Taban","Kadirtaban@mountainlabs.com","191aaaa9");
        userService.add(user);

        userService.Login(user.geteMail(),user.getPassword());

    }

}

