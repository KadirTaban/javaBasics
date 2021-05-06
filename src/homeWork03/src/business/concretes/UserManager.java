package homeWork03.src.business.concretes;

import homeWork03.src.business.abstracts.UserService;
import homeWork03.src.core.AuthServiceAdapter;
import homeWork03.src.dataAccess.abstracts.UserDao;
import homeWork03.src.dataAccess.concretes.AbcUserDao;
import homeWork03.src.entities.concretes.User;

import java.util.List;


public class UserManager implements UserService {


    private UserDao userDao;
    private AuthServiceAdapter authServiceAdapter;

    public UserManager(UserDao userDao,AuthServiceAdapter loggerService){
        super();
        this.userDao=userDao;
        this.authServiceAdapter=authServiceAdapter;


    }

    public UserManager(AbcUserDao userDao) {

    }

    @Override
    public void add(User user) {
        if (user.getPassword().length() <= 6) {
            System.out.println("Password length haven't be less six");
            return;
        }


        this.userDao.add(user);
        this.authServiceAdapter.login("Ürün eklendi" +user.getName());

    }

    @Override
    public List<User> getAll() {
        return null;
    }


}
