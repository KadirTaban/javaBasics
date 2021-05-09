package homeWork03.src.project.business.concretes;

import homeWork03.src.project.business.abstracts.UserService;
import homeWork03.src.project.core.AuthAdapter;
import homeWork03.src.project.core.AuthService;
import homeWork03.src.project.dataAccess.abstracts.UserDao;
import homeWork03.src.project.dataAccess.concretes.AbcUserDao;
import homeWork03.src.project.dataAccess.concretes.HibernateUserDao;
import homeWork03.src.project.entities.concretes.User;

import java.util.List;


public class UserManager implements UserService {


    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao,AuthService authService){
        super();
        this.userDao=userDao;
        this.authService= authService;


    }



    @Override
    public void add(User user) {
        if (user.getPassword().length() <= 6) {
            System.out.println("Password length haven't be less six");
            return;
        }


        this.userDao.add(user);
        this.authService.logToSystem("Ürün eklendi" +user.getName());

    }

    @Override
    public List<User> getAll() {
        return null;
    }


}