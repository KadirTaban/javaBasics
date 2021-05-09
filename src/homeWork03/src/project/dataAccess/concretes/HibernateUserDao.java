package homeWork03.src.project.dataAccess.concretes;

import homeWork03.src.project.dataAccess.abstracts.UserDao;
import homeWork03.src.project.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi");
    }

    @Override
    public boolean Login(String email, String password) {

        return true;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(String password) {
        return null;
    }

    //@Override
    //public User get(String password) {
        //return null;
    //}

    @Override
    public List<User> getAll() {
        return null;
    }
}