package homeWork03.src.dataAccess.concretes;

import homeWork03.src.dataAccess.abstracts.UserDao;
import homeWork03.src.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernate ile eklendi");
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

    @Override
    public List<User> getAll() {
        return null;
    }
}